//  METHOD  OVERRIDING  

public class Class15 {

    public static void main(String args[]) {

        Deer d = new Deer();
        d.eat();

        Animal3 a = new Animal3();
        a.eat();
    }
}

class Animal3 {

    void eat() {
        System.out.println("wild animals eat anyting");
    }
}

class Deer extends Animal3 {
    void eat() {
        System.out.println("deer eat grass");
    }
}
