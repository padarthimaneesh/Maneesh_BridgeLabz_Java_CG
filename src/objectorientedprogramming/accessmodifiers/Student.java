package objectorientedprogramming.accessmodifiers;
class Student {
    public int rollNumber;        // public
    protected String name;        // protected
    private double CGPA;          // private

    // Public methods to access private variable
    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

// Subclass
class PostgraduateStudent extends Student {
    void displayDetails() {
        System.out.println("Roll Number : " + rollNumber); // public
        System.out.println("Name        : " + name);       // protected
        System.out.println("CGPA        : " + getCGPA());  // private via method
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.rollNumber = 101;
        pg.name = "Maneesh";
        pg.setCGPA(9.2);

        pg.displayDetails();
    }
}
