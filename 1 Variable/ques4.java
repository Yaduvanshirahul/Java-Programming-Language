import java.util.Scanner;

public class ques4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
         float c = sc.nextFloat();

         float d = a+b+c;

        System.out.println("total cost of item is"+ d);

        sc.close();
    }
}
