//   DEEP   COPY   CONSTRUCTOR

public class Class7 {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);

        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }

}

class Student {

    int marks[];

    Student(Student s1) {
        marks = new int[3];

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {

        System.out.println("default constructor");
        marks = new int[3];
    }
}