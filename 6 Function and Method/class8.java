// FUNCTION OVERLOADING USING DIFFERENT DATA TYPE 

public class class8 {
    
      public static int sum(int a , int b)
      {
        int sum = a + b;
        return sum;
      }
      public static double sum(double a , double b , double c)
      {
        double sum = a + b + c;
        return sum;
      }
      public static float sum( float a , float b , float c)
      {
        float sum = a + b + c;
        return sum;
      }

      public static void main(String[] args) {
        
        
        System.out.println("sum is " + sum(2.4f , 4.3f , 2.1f));
        System.out.println("sum is " + sum(2 , 4));
        System.out.println("sum is " + sum(2.4, 4.3 , 2.1));
      }
}
