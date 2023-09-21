//    INHERITENCE  CONCEPT  IN OOPS

public class Class10 {
    public static void main(String args[]) {

        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("they can eat");
    }

    void breathe() {
        System.out.println("they can breathe");
    }
}
class Fish extends Animal {

        int fins;

        void swim() {
            System.out.println("fish can swim");
        }
    }