//  CREATE A ARRAY AND TAKE INPUT FROM USER IN ARRAY

import java.util.Scanner;
public class class2 {
    public static void main(String[] args) {
        
        int marks[] = new int[6];
        Scanner sc = new Scanner(System.in);

        marks[0]= sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Marks in Physics "+marks[0]);
        System.out.println("Marks in  Math "+marks[1]);
        System.out.println("Marks in Chemistry "+marks[2]);

        sc.close();
    }
}
