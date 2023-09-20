//     COPY CONSTRUCTOR

public class Class8 {
    public static void main(String args[]) {

        Stdent s1 = new Stdent();
        s1.name = "rahul";
        s1.roll = 313;
        s1.password = "ete";

        Stdent s2 = new Stdent(s1);

        s1.password = "eye"; // -->> HERE PASSWORD IS NOT UPDATE BECZ ITS ALREADY COPY THE S1 INTO S2

        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
    }
}

class Stdent {
    String name;
    String password;
    int roll;

    Stdent() {
        System.out.println("constructor called");
    }

    Stdent(Stdent s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }

}