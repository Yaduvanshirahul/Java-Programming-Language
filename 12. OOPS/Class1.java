//      BASIC TERMONOLOGY OF CLASSES AND OBJECT

public class Class1 {

    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.getColor("blue");
        System.out.println(p1.color);
        p1.getTip(5);
        System.out.println(p1.tip);

    }
}

class Pen {

    String color;
    int tip;

    void getColor(String newcolor) {

        color = newcolor;
    }

    void getTip(int newtip) {

        tip = newtip;
    }
}
