package objectorientedprogramming.constructors.level1;
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        c1.display();
        c2.display();
    }
}
