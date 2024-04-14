package com.ncirl.robotics.robot;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SmartRobotServer extends SmartRobotServiceGrpc.SmartRobotServiceImplBase {

    private Random random = new Random();
    private static final int MIN_STOCK_THRESHOLD = 60; // Minimum stock threshold for alerts

    @Override
    public void checkInventory(InventoryCheckRequest request,
                               StreamObserver<InventoryCheckResponse> responseObserver) {
        int currentStock = random.nextInt(201); // Random stock number between 0 and 200
        boolean isRestockNeeded = currentStock < MIN_STOCK_THRESHOLD;
        String condition = isRestockNeeded ? "Low" : "Sufficient";

        InventoryCheckResponse response = InventoryCheckResponse.newBuilder()
                .setItemCount(currentStock)
                .setCondition(condition)
                .setIsRestockNeeded(isRestockNeeded)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void monitorInventory(InventoryMonitorRequest request,
                                 StreamObserver<InventoryMonitorResponse> responseObserver) {
        // Continuously monitor the inventory and send updates every 30 seconds.
        // This method implementation will depend on your specific logic for monitoring.
        // For example, it might look something like this:
        new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    // Here you would implement your inventory monitoring logic
                    // For demonstration purposes, we're just simulating some values

                    int itemsScanned = random.nextInt(201); // Simulating the number of items scanned
                    String status = itemsScanned >= MIN_STOCK_THRESHOLD ? "Sufficient" : "Low";
                    String timestamp = LocalDateTime.now().toString();

                    InventoryMonitorResponse response = InventoryMonitorResponse.newBuilder()
                            .setStatus(status)
                            .setItemsScanned(itemsScanned)
                            .setTimestamp(timestamp)
                            .build();

                    responseObserver.onNext(response);
                    Thread.sleep(30000); // Wait for 30 seconds
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                responseObserver.onCompleted();
            }
        }).start();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 8081; // Adjust if needed
        Server server = ServerBuilder.forPort(port)
                .addService(new SmartRobotServer())
                .build()
                .start();

        System.out.println("Smart Robot Server started, listening on " + port);
        server.awaitTermination();
    }
}
