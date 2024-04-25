//package com.ncirl;

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
        System.out.println(WeatherArrayListReader.readings);
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

    public static class WeatherArrayListReader {

        public static final ArrayList<Weather> readings = new ArrayList<>();

        public static void main(String[] args) {
            // Add some sample sensor readings to the list
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new Task(), 0, 1500); // Schedule the task to run every 15 seconds
        }

        public static void startReading() {
            readings.add(new Weather(25.5, 60, 0.1, 2, 22, 10));
            readings.add(new Weather(24.8, 58, 0.0, 2.1,222, 12));
            readings.add(new Weather(26.3, 62, 0.2, 3.0, 23, 8));
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new Task(), 0, 1500); // Schedule the task to run every 1.5 seconds
        }


        static class Task extends TimerTask {
            private int index = 0;

            @Override
            public void run() {
                if (index < readings.size()) {
                    Weather reading = readings.get(index);
                    System.out.println("Sensor Reading: " + reading);
                    index++;
                } else {
                    System.out.println("End of sensor readings reached.");
                    index = 0; // Reset index to start over
                }
            }
        }
    }

    public static class Weather {
        private double temperature;
        private double humidity;
        private double pressure;
        private double windSpeed;
        private int windBearing;
        private String windDirection;
        private double precipitation;

        private static final String[] DIRECTIONS = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};

        public Weather(
                double temperature,
                double humidity,
                double pressure,
                double windSpeed,
                int windBearing,
                double precipitation

        ) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
            this.windSpeed = windSpeed;
            this.precipitation = precipitation;
            this.windBearing = windBearing;
            this.windDirection = calculateWindDirection(this.windBearing);
        }

        private String calculateWindDirection(int windBearing) {
            int index = (int) Math.round((windBearing % 360) / 45.0);
            return DIRECTIONS[index];
        }

        public double getTemperature() {
            return this.temperature;
        }

        public double getHumidity() {
            return this.humidity;
        }

        public double getPressure() {
            return this.pressure;
        }

        public double getWindSpeed() {
            return this.windSpeed;
        }

        public String getWindDirection() {
            return this.windDirection;
        }

        public int getWindBearing() {
            return this.windBearing;
        }

        public double getPrecipitation() {
            return this.precipitation;
        }

        @Override
        public String toString() {
            return "Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Precipitation: " + precipitation + "mm, Wind: " + windDirection + " " + windSpeed + "m/s";
        }
    }
}