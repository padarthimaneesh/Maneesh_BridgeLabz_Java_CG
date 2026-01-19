package objectorientedprogramming.keywordandoperator.level1;
class Patient {

    // Static
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    // Final
    final int patientID;

    // Instance variables
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display(Object obj) {
        if (obj instanceof Patient) {
            System.out.println(name + " | " + age + " | " + ailment + " | ID: " + patientID);
        }
    }

    public static void main(String[] args) {
        Patient p = new Patient("Ravi", 35, "Fever", 7001);
        p.display(p);
        getTotalPatients();
    }
}

