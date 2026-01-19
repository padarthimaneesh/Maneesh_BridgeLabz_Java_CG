package objectorientedprogramming.accessmodifiers;
class Employee {
    public int employeeID;         // public
    protected String department;   // protected
    private double salary;         // private

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {
    void displayEmployeeDetails() {
        System.out.println("Employee ID : " + employeeID);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : " + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 5001;
        m.department = "IT";
        m.setSalary(85000);

        m.displayEmployeeDetails();
    }
}

