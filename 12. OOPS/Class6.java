//  PARAMETRIZED CONSTRUCTOR

public class Class6 {
    public static void main(String[] args) {

        Student1 s = new Student1();
        Student1 s1 = new Student1("rahul");
        Student1 s2 = new Student1(4);

        // Student s = new Student1("rahul" , 4); -->> isn't exist these type of
        // constructor

        System.out.println(s1.name);
        System.out.println(s2.age);

    }
}

class Student1 {

    String name;
    int age;
    String password;

    Student1() {
        System.out.println("constructor is called");
    }

    Student1(String name) {
        this.name = name;
    }

    Student1(int age) {
        this.age = age;

    }

}