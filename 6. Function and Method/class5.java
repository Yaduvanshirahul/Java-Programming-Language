// MULTIPLICATION OF TWO NUMBER

public class class5 {
    
    public static int multi(int a , int b)
    {
        int m = a*b;
        
        return m;
            
        }
        public static void main(String[] args) {
            
            int a= 3; 
            int b = 5;
            int prod = multi(a , b);   //   store value of m in (int prod)

            System.out.println(" product of two no. is "+ prod);

            prod = multi(10 , 23);
            System.out.println(" product of two no. is "+ prod);
        }
    }

