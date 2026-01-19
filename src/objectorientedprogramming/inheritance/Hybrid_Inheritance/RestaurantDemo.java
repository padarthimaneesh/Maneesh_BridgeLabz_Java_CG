package objectorientedprogramming.inheritance.Hybrid_Inheritance;
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Worker c = new Chef("Ravi", 1);
        Worker w = new Waiter("Amit", 2);

        c.performDuties();
        w.performDuties();
    }
}
