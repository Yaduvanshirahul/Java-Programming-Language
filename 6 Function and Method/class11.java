//  PRIME NUMBER FIND USING CALL BY VALUE

public class class11 {
     
    public static void prime(int n)
    {
        for ( int i= 2; i<=n-1;)
        {
            if( n%i==0)
            {
                System.out.println("n is not prime no.");
                break;
            } 
               System.out.println("n is prime no.");
               break;
    }
     
        }
    public static void main(String[] args) {
        
        prime(10);
    }
}
