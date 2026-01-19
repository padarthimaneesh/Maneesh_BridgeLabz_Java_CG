package objectorientedprogramming.keywordandoperator.level1;
class Product {

    // Static
    static double discount = 10.0;

    // Final
    final int productID;

    // Instance variables
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void process(Object obj) {
        if (obj instanceof Product) {
            System.out.println(productName + " | Qty: " + quantity + " | ID: " + productID);
        }
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 60000, 1, 301);
        p.process(p);
    }
}
