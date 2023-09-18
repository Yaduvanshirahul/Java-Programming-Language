public class Class8 {
    public static void main(String args[]) {

        Stdent s1 = new Stdent();
        s1.name = "rahul";
        s1.roll = 313;
        s1.password = "ete";

        Stdent s2 = new Stdent(s1);
        s1.password = "eye";
    }
}

class Stdent{
    String name;
    String password;
    int roll ;

    Stdent(Stdent s1)
    {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Stdent(){
        System.out.println("constructor is called");
    }
    Stdent(String name){
        this.name = name;
    }
    Stdent(int roll){
        this.roll = roll;
    }
    Stdent(String password){
        this.password= password
    }
}