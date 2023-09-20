//  SHALLOW   COPY  CONSTRUCTOR  

public class Class9 {

    public static void main(String args[]) {

        Marks m = new Marks();
        m.marks[0] = 12;
        m.marks[1] = 13;
        m.marks[2] = 14;

        Marks m2 = new Marks(m);
        m.marks[1] = 25;
        for (int i = 0; i < 3; i++) {
            System.out.println(m2.marks[i]);
        }

    }
}

class Marks {
    int marks[];

    Marks(Marks m) {
        marks = new int[3];
        this.marks = m.marks;
    }

    Marks() {
        marks = new int[3];
        System.out.println("constructor is called");
    }
}
