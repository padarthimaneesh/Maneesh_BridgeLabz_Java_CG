package objectorientedprogramming.inheritance.Assisted_Problems;
class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed + ", Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int speed, String fuel, int seats) {
        super(speed, fuel);
        this.seatCapacity = seats;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int speed, String fuel, int load) {
        super(speed, fuel);
        this.loadCapacity = load;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(int speed, String fuel) {
        super(speed, fuel);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10000),
                new Motorcycle(150, "Petrol")
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
