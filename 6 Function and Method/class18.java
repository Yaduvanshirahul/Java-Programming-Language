public class class18 {
    
    public static boolean isPrime( int n)
    {
        boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isPrime = false;
                break;
            }
          
        }
          return isPrime;

    }
    
    public static void isPrimeRange(int n)
    {
         for(int i=2;i<=n;i++)
         {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
         }
         System.out.println();
    }
    public static void main(String[] args) {
        
        isPrimeRange(20);
    }
}
