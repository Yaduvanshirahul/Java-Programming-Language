//  MULTILEVEL INHERITENCE 

public class Class11 {
    public static void main(String args[]) {

        Dog bull = new Dog();
        bull.color = "red";
        bull.legs = 4;
        bull.breathe();
        bull.run();
        System.out.println(bull.legs);
    }
}

class Animal1 {

    String color;

    void breathe() {
        System.out.println("they can breathe");
    }

    void eats() {
        System.out.println("they can eat");
    }
}

class Mammal extends Animal1 {
   // INHERITE  THE PROPERTIES OF ANIMAL 
   
   int legs;
} 
    
class Dog extends Mammal{  
     //INHERITE THE MAMMAL PROPERITIES
    void run() {
        System.out.println("they can run");
    }
}
