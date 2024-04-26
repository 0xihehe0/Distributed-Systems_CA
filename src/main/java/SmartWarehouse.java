//package com.ncirl;

import com.ncirl.Weather;
import com.ncirl.WeatherArrayListReader;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class SmartWarehouse extends Application {
    private Label weatherLabel;

    @Override
    public void start(Stage primaryStage) {
        // Setup the main layout pane
        BorderPane borderPane = new BorderPane();
        // Start reading weather data
        WeatherArrayListReader.startReading();

        // Set up the left, center, and right panes
        borderPane.setLeft(setupLeftPane());
        borderPane.setLeft(setupCenterPane());
        borderPane.setLeft(setupRightPane());

        // Set the scene and show the stage
        Scene scene = new Scene(borderPane, 800, 600);
        primaryStage.setTitle("Smart Warehouse");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private VBox setupLeftPane() {
        // Create a VBox for the left pane
        VBox leftBox = new VBox(10);
        leftBox.setAlignment(Pos.CENTER);

        // Initialize the weather data label
//        System.out.println(WeatherArrayListReader.readings);
        weatherLabel = new Label("Waiting for weather data...");
        leftBox.getChildren().add(weatherLabel);

        // Return the fully set up left VBox
        return leftBox;
    }

    private VBox setupCenterPane() {
        // Create a VBox for the left pane
        VBox leftBox = new VBox(10);
        leftBox.setAlignment(Pos.CENTER);

        // Initialize the weather data label
        weatherLabel = new Label("Waiting for weather data...");
        leftBox.getChildren().add(weatherLabel);

        // Return the fully set up left VBox
        return leftBox;
    }

    private VBox setupRightPane() {
        // Create a VBox for the left pane
        VBox leftBox = new VBox(10);
        leftBox.setAlignment(Pos.CENTER);

        // Initialize the weather data label
        weatherLabel = new Label("Waiting for weather data...");
        leftBox.getChildren().add(weatherLabel);

        // Return the fully set up left VBox
        return leftBox;
    }



    @Override
    public void stop() throws Exception {
        super.stop();
        // Perform any necessary cleanup here when the application is stopped
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}