package objectorientedprogramming.classandobject.level2;
/*
Problem Statement:
Create a CartItem class with attributes itemName, price, and quantity.
Add methods to add item, remove item, and display total cost.
*/

class CartItemDetails {
    private String itemName;
    private double price;
    private int quantity;

    public CartItemDetails(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
    }

    public void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + (price * quantity));
    }
}

public class CartItem {
    public static void main(String[] args) {
        CartItemDetails cart = new CartItemDetails("Laptop", 50000);

        cart.addItem(2);
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}