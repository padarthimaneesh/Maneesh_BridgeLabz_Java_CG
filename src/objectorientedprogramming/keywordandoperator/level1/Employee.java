package objectorientedprogramming.keywordandoperator.level1;
class Employee {

    // Static
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;

    // Final
    final int id;

    // Instance variables
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display(Object obj) {
        if (obj instanceof Employee) {
            System.out.println(companyName + " | " + name + " | " + designation + " | " + id);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("Maneesh", 5001, "Developer");
        e.display(e);
        displayTotalEmployees();
    }
}

