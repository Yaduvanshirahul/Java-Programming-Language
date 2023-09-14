//   this KEYWORD

public class Class3 {
    public static void main(String args[]) {

        Pencil p1 = new Pencil();
        p1.setColor("red");

        // System.out.println(p1.color); -->> color is private so we can't access
        // directly it..

        System.out.println(p1.getcolor());

        p1.settip(4);

        System.out.println(p1.gettip());

    }
}

class Pencil {

    private String color;
    private int tip;

    void setColor(String newcolor) {
        this.color = newcolor;
    }

    void settip(int newtip) {

        this.tip = newtip;
    }

    String getcolor() {

        return this.color;
    }

    int gettip()

    {

        return this.tip;
    }
}
