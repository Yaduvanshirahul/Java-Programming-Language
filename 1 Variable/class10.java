//  AREA OF CIRCLE

import java.util.Scanner;
public class class10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        float b = sc.nextFloat();
        
        double c = 3.14 *a *a;
        float n = 3.14f * b *b;

        System.out.println(c);
        System.out.println(n);


        sc.close();  // close it to save resource leak
        
    }
}
