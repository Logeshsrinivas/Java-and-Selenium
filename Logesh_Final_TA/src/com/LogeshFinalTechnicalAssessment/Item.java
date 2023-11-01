package com.LogeshFinalTechnicalAssessment;

class Item {
    private String itemName;
    private String itemidNo;
    private int itemQuantity;
    private double itemPrice;
    // Constructors
    public Item(String itemName, String itemidNo, int itemQuantity, double itemPrice) {
        this.itemName = itemName;
        this.itemidNo = itemidNo;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }
    public Item(String itemName, String itemidNo, int itemQuantity) {
        this(itemName, itemidNo, itemQuantity, 500.00); // Default itemPrice is 500
    }
    public Item(String itemName, String itemidNo) {
        this(itemName, itemidNo, 0); // Default itemQuantity is 0, itemPrice is 500
    }

    // Getter and Setter methods
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemidNo() {
        return itemidNo;
    }
    public void setItemidNo(String itemidNo) {
        this.itemidNo = itemidNo;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}