// FIND POWER OF X TO N 

public class Class9 {

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }
        /*
         * int xnm = power(x, n - 1);
         * int xnm1 = x * xnm;
         * return xnm1;
         */

        return x * power(x, n - 1);
    }

    public static void main(String args[]) {
        System.out.println(power(2, 7));
    }
}
