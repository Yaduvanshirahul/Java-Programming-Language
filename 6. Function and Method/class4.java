// CALL BY VALUE 

public class class4 {
 
    public static void changeA(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp ;

        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
        
    }

    public static void main(String[] args) {
        
        int a = 3;
        int b = 2;
        changeA(a , b);

       /*    System.out.println("a is "+ a);    ---> here value of a and b isn't change becz in func. copy of value pass
        System.out.println("b is "+ b);              all changes in a and b is occur only in func. when control goes to main the value of a and b is same 
        */
        
    }
}
