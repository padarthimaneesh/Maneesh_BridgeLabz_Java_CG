package objectorientedprogramming.instancevsclass;
class Course {
    // Instance variables
    String courseName;
    int duration; // in months
    double fee;

    // Class variable
    static String instituteName = "ABC Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " months");
        System.out.println("Fee           : " + fee);
        System.out.println("Institute     : " + instituteName);
    }

    // Class (static) method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 30000);
        Course c2 = new Course("Python", 4, 25000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Technologies");

        c1.displayCourseDetails();
    }
}
