package com.ncirl;

public class Warehouse {
    private String itemId;
    private String itemName;
    private int quantity;

    public Warehouse(String itemId, String itemName, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Item Name: " + itemName + ", Quantity: " + quantity;
    }
}
