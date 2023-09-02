//  SEARCH AN ELEMENT IN A 2-D ARRAY  

import java.util.Scanner;

public class class2 {

    public static boolean search(int martrix[][], int key) {
        for (int i = 0; i < martrix.length; i++) {
            for (int j = 0; j < martrix[0].length; j++) {
                if (martrix[i][j] == key) {
                    System.out.println("element found at ( " + i + " , " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("element in not present in array");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int martrix[][] = new int[3][4];
        int m = 3;
        int n = 4;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                martrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(martrix[i][j] + " ");
            }
            System.out.println();
        }

        search(martrix, 6);

        sc.close();
    }
}
