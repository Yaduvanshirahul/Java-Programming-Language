//      SUM OF FIRST N NATURAL NUMBER 

public class Class2 {

    public static int printSum(int n) {

        if (n == 1) {
            return 1;
        }

        int sum = printSum(n - 1);
        int fac = n + sum;

        return fac;
    }

    public static void main(String args[]) {
        int n = 5;

        System.out.println(printSum(n));
    }
}
