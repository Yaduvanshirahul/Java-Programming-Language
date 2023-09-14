//      BASIC TERMONOLOGY OF CLASSES AND OBJECT

public class Class1 {

    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("blue");// pass the color value to function getcolor
        System.out.println(p1.color);

        p1.setTip(5);// pass the tip value to function setcolor
        System.out.println(p1.tip);

        p1.setcolor();// directly call the function for print the color

    }
}

class Pen {

    String color;
    int tip;

    void setColor(String newcolor) {

        color = newcolor;
    }

    void setcolor() {

        System.out.println(color);
    }

    void setTip(int newtip) {

        tip = newtip;
    }
}
