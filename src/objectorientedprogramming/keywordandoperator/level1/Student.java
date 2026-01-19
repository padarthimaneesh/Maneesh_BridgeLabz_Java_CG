package objectorientedprogramming.keywordandoperator.level1;
class Student {

    // Static
    static String universityName = "SRM University";
    static int totalStudents = 0;

    // Final
    final int rollNumber;

    // Instance variables
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display(Object obj) {
        if (obj instanceof Student) {
            System.out.println(name + " | " + rollNumber + " | " + grade);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Maneesh", 1123, 'A');
        s.display(s);
        displayTotalStudents();
    }
}
