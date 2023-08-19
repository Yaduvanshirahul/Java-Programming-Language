// SUM OF TWO NUMBER WITH THE HELP OF PARAMETER FUNCTION

import java.util.Scanner;
public class class3 {

    public static int getsum(int num1 , int num2)
    {
        int sum = num2 + num1;

       System.out.println("sum is "+ sum);
        return sum;
    }
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two number");
        int a = sc.nextInt();
        int b = sc.nextInt();


        getsum(a , b);
        sc.close();
    }
}
