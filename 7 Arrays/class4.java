//   AVERAGE OF THE THREE NUMBER IN ARRAY 

import java.util.Scanner;
public class class4 {
    public static void main(String[] args) {
        
           
        int marks[] = new int[43];
        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
          marks[2]=sc.nextInt();

          System.out.println("Marks in physics "+ marks[0]);

           System.out.println("Marks in chemistry"+ marks[1]);

            System.out.println("Marks in math "+ marks[2]);

            int average = (marks[0]+marks[1]+marks[2])/3;

            System.out.println("Percentage of all three subject "+ average);
            sc.close();
    }
}
