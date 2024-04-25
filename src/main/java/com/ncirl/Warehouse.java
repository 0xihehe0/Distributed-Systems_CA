package com.ncirl;

public class Warehouse {
    private String productId;
    private String itemName;
    private int quantity;

    // 修改构造函数中的参数名以匹配字段名称
    public Warehouse(String productId, String itemName, int quantity) {
        this.productId = productId; // 使用正确的字段名称
        this.itemName = itemName;
        this.quantity = quantity;
    }

    // 获取产品ID的方法
    public String getProductId() {
        return productId;
    }

    // 获取产品名称的方法
    public String getItemName() {
        return itemName;
    }

    // 获取产品数量的方法
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Item Name: " + itemName + ", Quantity: " + quantity;
    }
}
