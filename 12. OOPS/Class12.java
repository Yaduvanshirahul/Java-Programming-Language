//  HIERARCHIAL INHERITANCE  

public class Class12 {
    public static void main(String args[]) {

        Bird b = new Bird();
        b.eat();
        b.breathe();
        b.fly();

        Mammal1 m = new Mammal1();
        m.eat();
        m.breathe();
        m.walk();
    }
}

class Animal2 {

    String color;

    void eat() {
        System.out.println("they can eat");
    }

    void breathe() {
        System.out.println("they can breathe");
    }
}

class FISH extends Animal2 {
    void swim() {
        System.out.println("they can swim ");
    }
}

class Bird extends Animal2 {
    void fly() {
        System.out.println("they can fly");
    }
}

class Mammal1 extends Animal2 {
    void walk() {
        System.out.println("they can walk");
    }
}