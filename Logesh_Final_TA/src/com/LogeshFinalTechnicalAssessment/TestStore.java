package com.LogeshFinalTechnicalAssessment;

public class TestStore {
    public static void main(String[] args) {
        // Create a Customer instance
        Customer customer = new Customer("LogeshSrinivasan", "ES6567", 1000.00);
        // Create three Item instances
        Item item1 = new Item("DairyMilkSilk", "IID56", 10, 83);
        Item item2 = new Item("Pepsi", "IID10", 0, 20);
        Item item3 = new Item("HenkoLiquid", "IID100", 2, 150);
        // Display customer details
        System.out.println("Customer Details");
        customer.print();
        // Buy items
        System.out.println("Item1 Details");
        customer.buyItem(item1);
        System.out.println("Item2 Details");
        customer.buyItem(item2);
        System.out.println("Item3 Details");
        customer.buyItem(item3);
    }
}