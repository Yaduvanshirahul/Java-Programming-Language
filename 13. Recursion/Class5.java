//   FIBNOCCI SERIES

public class Class5 {

    public static int fibna(int n) {

        if (n == 0 || n == 1) {

            return n;
        }

        int fib1 = fibna(n - 1);
        int fib2 = fibna(n - 2);

        return fib1 + fib2;

    }

    public static void main(String args[]) {

        System.out.println(fibna(5));
    }
}
