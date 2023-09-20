//  DEEP COPY  CONSTRUCTOR  

public class Class9 {

    public static void main(String[] args) {

        Marks m1 = new Marks();
        m1.marks[0] = 11;
        m1.marks[1] = 13;
        m1.marks[2] = 12;

        Marks m2 = new Marks(m1);

        m1.marks[2] = 14;
        for (int i = 0; i < 3; i++) {
            System.out.println(m2.marks[i]);
        }
    }
}

class Marks {
    int marks[];

    Marks(Marks m1) {
        marks = new int[3]; // Initialize the marks array here

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = m1.marks[i];
        }
    }

    Marks() {
        System.out.println("constructor is called");
    }
}
