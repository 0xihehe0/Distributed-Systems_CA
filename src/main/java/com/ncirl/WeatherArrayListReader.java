package com.ncirl;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherArrayListReader {

    private static final ArrayList<Weather> readings = new ArrayList<>();

    public static void main(String[] args) {
        // Add some sample sensor readings to the list
        readings.add(new Weather(25.5, 60, 0.1, 2, 22, 10));
        readings.add(new Weather(24.8, 58, 0.0, 2.1,222, 12));
        readings.add(new Weather(26.3, 62, 0.2, 3.0, 23, 8));

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new Task(), 0, 15000); // Schedule the task to run every 15 seconds
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