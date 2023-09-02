// GREATER OF THREE NUMBER 

import java.util.Scanner;
public class class6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if((a>=b) && (b>=c)){

            System.out.println("greater value is a " + a);
        }
        else if(b>=c){

            System.out.println("greater value is b " + b);
        }

        else {
            System.out.println("greater value is c " + c);
        }
        sc.close();
    }
}
