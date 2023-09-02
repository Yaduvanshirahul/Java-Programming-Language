//  CHECK A NUMBER IS PRIME OR NOT  

public class class16 {
    
    public static boolean isPrime(int n)
    {
        boolean isPrime = true;

        for( int i =2; i<=n-1;i++)
        {
            if(n%i==0)
            {
                isPrime = false;
                break;
            }
          
        }
        System.out.println(isPrime);
          return isPrime;
    }

    public static void main(String[] args) {
        
        isPrime(8);
    }
}
