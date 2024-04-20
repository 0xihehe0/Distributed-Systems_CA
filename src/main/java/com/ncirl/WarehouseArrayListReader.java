package com.ncirl;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class WarehouseArrayListReader {

    private static final ArrayList<Warehouse> inventory = new ArrayList<>();

    public static void main(String[] args) {
        // Add some sample inventory items to the list
        inventory.add(new Warehouse("001", "Screwdriver", 150));
        inventory.add(new Warehouse("002", "Hammer", 85));
        inventory.add(new Warehouse("003", "Wrench", 120));

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new Task(), 0, 5000); // Schedule the task to run every 5 seconds
    }

    static class Task extends TimerTask {
        private int index = 0;

        @Override
        public void run() {
            if (index < inventory.size()) {
                Warehouse item = inventory.get(index);
                System.out.println("Inventory Update: " + item);
                index++;
            } else {
                System.out.println("End of inventory list reached.");
                index = 0; // Reset index to start over
            }
        }
    }
}
