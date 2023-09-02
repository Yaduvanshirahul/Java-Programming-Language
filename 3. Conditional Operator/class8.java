import java.util.Scanner;
public class class8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String result = (marks>=33)? "pass":"fail";

        System.out.println(result);
        sc.close();
    }
}
