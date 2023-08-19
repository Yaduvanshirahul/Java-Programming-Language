    /*  TAKE INPUT IN JAVA FROM USER */

import java.util.Scanner;

public class class8 {

    public static void main(String[] args)
    
    {
       Scanner sc = new Scanner(System.in);

       String s = sc.nextLine();
       String input = sc.next();
       int a = sc.nextInt();
       double d = sc.nextDouble();
       boolean g = sc.nextBoolean();

       System.out.println(s);
       System.out.println(input);
       System.out.println(a);
       System.out.println(d);
       System.out.println(g);

       sc.close();
}
}