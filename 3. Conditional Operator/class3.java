// FIND A NUMBER IS EVEN OR ODD

import java.util.Scanner;
public class class3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2==0)
        {
            System.out.println("a is a even number");
        }

        else{

            System.out.println("a is odd no");
        }

        sc.close();
    }
}
