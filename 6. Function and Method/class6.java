// FACTORIAL OF A NUMBER

public class class6 {

    public  static int fact(int a)
    {
        int f = 1;
        for( int i = 1 ; i<=a; i++)
        {
             f = f*i;
           
        }
         System.out.println("factorial of a no. is "+ f);
        return f;
    }
    
    public static void main(String[] args) {
        
        int n = 4;
        fact(n);
       
    }
}
