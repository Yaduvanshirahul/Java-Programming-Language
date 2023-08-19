//   BINARY OPERATOR IN JAVA

package operator;
import java.util.Scanner;

public class class1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum  = a+b;
        int sub  = a-b;
        int multi = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("additon of two no."+sum);
        System.out.println("subtractionn of two no."+sub);
        System.out.println("multiplication of two no."+multi);
        System.out.println("division of two no."+div);
        System.out.println("moduls of two no."+mod);

        sc.close();

    }
    
    
}
