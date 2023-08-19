// PRINT LARGEST OF TWO NUMBER

import java.util.Scanner;
public class class2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){

            System.out.println("largest vale is a " +a);
        }

        else{

            System.out.println("largest value is b  "+b);
        }

        sc.close();

    }
}
