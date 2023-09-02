public class class10 {
    
    public static void main(String[] args) {
         
        int n = 10;

        for (int i=2;i<=n-1;i++)
        {
                if(n%i == 0) 
                {
                   System.out.println("number is not prime");
                   break;
                }
                else{
                        System.out.println("number is prime");
                }
        }
        
          
        }
    
}
