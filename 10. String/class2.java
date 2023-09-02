//   TAKE INPUT FROM USER OF STRING TYPE

import java.util.Scanner;

public class class2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // print only single word till no blank space occur
        String str1 = sc.nextLine(); // print all word in sentence

        System.out.println("First string value " + str);
        System.out.println("Second string value " + str1);

        sc.close();
    }
}
