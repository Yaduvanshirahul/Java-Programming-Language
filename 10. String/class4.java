//  CONCATENATION (  TO JOIN  TWO OR MORE SRING  )

import java.util.Scanner;

public class class4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "Rahul Yadav";

        String fullname = str + " " + str1;

        System.out.println("the concatenation of string is " + fullname);

        sc.close();

    }

}
