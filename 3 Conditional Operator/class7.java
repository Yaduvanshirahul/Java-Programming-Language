// TERNARY OPERATOR IN JAVA

import java.util.Scanner;
public class class7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String type = (number%2==0)? "even":"odd";

        System.out.println(type);

        sc.close();
        
    }
}
