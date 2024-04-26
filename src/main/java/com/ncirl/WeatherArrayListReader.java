package com.ncirl;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherArrayListReader {

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

    public static ArrayList<Weather> getWeather(){
        readings.add(new Weather(25.5, 60, 0.1, 2, 22, 10));
        readings.add(new Weather(24.8, 58, 0.0, 2.1,222, 12));
        readings.add(new Weather(26.3, 62, 0.2, 3.0, 23, 8));
        return readings;
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