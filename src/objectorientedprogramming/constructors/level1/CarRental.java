package objectorientedprogramming.constructors.level1;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void calculateTotalCost() {
        double totalCost = rentalDays * costPerDay;
        System.out.println("Total Cost: " + totalCost);
    }

    void display() {
        System.out.println(customerName + " | " + carModel + " | Days: " + rentalDays);
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Maneesh", "Swift", 4);

        cr.display();
        cr.calculateTotalCost();
    }
}

