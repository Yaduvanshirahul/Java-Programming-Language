//  HYBRID INHERITENCE

public class Class13 {

    public static void main(String args[]) {

        Car c = new Car();
        c.engine();
        c.numdoors();

        Boat b = new Boat();
        b.engine();
        b.sell();
    }
}

class Vehicle {

    String color;

    void price() {
        System.out.println("price is more");
    }

    void modelyear() {
        System.out.println("model of 2023");
    }
}

class Car extends Vehicle {
    void engine() {
        System.out.println("diesel engine");
    }

    void numdoors() {
        System.out.println("no. of doors 4");
    }
}

class Boat extends Vehicle {
    void engine() {
        System.out.println("petrol engine");
    }

    void sell() {
        System.out.println("ready for sell");
    }
}
