//    CHANGE VALUE IN ARRAY 

import java.util.Scanner;
public class class3 {
    public static void main(String[] args) {
        
        int marks[] = new int[43];
        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
          marks[2]=sc.nextInt();

          System.out.println("Marks in physics "+ marks[0]);

           System.out.println("Marks in chemistry"+ marks[1]);

            System.out.println("Marks in math "+ marks[2]);

            System.out.println("After updating marks in math");

            marks[2]= 34;

             System.out.println("Marks in math "+ marks[2]);

     sc.close();

    }
}
