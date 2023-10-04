//  FIND THE FACTORIAL OF N NUMBER

public class Class1 {
    public static int printfact(int n) {
        if (n == 0) {
            return 1;
        }

        int fnm1 = printfact(n - 1);

        int fn = n * fnm1;

        return fn;

    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(printfact(n));
    }
}