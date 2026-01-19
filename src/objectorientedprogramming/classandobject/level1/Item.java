package objectorientedprogramming.classandobject.level1;
/*
Program to Track Inventory of Items
Problem Statement:
Create an Item class with attributes itemCode, itemName, and price.
Add a method to display details and calculate total cost for a quantity.
*/

class ItemDetails {
    private int itemCode;
    private String itemName;
    private double price;

    public ItemDetails(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
    }
}

public class Item {
    public static void main(String[] args) {
        ItemDetails item = new ItemDetails(201, "Pen", 10);

        item.displayItem();
        System.out.println("Total Cost for 5 items: ₹" + item.calculateTotalCost(5));
    }
}