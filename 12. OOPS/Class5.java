//   CONSTRUCTOR

public class Class5 {
    public static void main(String args[]) {

        Pen3 p = new Pen3();
        System.out.println(p.getcolor());
    }
}

class Pen3 {
    String color = "red";
    int tip = 5;

    Pen3() {
        System.out.println("constructor is called");
    }

    String getcolor() {
        return this.color;

    }
}