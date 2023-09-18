//     GETTER AND SETTER FUNCTION

public class Class4 {
    public static void main(String[] args) {

        PEN2 p1 = new PEN2();
        p1.setcolor("red");
        p1.settip(4);

        // System.out.println(p1.color); -->> Can't access the color directly

        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());

    }
}

class PEN2 {
    private String color;
    private int tip;

    void setcolor(String newcolor) {
        this.color = newcolor;
    }

    void settip(int newtip) {
        this.tip = newtip;
    }

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

}
