//  CREATION OF A 2-D ARRAY

import java.util.Scanner;

public class class1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int martrix[][] = new int[3][3];

        int n = 3; // OR CAN USE ( matrix.lenght )
        int m = 3; // OR CAN USE ( matrix[0].length)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                martrix[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(martrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}