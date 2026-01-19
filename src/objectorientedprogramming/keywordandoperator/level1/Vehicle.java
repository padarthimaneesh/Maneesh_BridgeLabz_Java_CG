package objectorientedprogramming.keywordandoperator.level1;
class Vehicle {

    // Static
    static double registrationFee = 5000;

    // Final
    final int registrationNumber;

    // Instance variables
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println(ownerName + " | " + vehicleType + " | Reg No: " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Maneesh", "Car", 9001);
        v.display(v);
    }
}

