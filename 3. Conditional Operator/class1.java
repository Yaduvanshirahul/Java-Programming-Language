 // IF ELSE CONDITION IN JAVA
 
 import java.util.Scanner;


 public class class1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=18)
        {
            System.out.println("you are eligible for voting");

        }
          
        else{

            System.out.println("you are not eligible for voting");
        }
    sc.close();
    }
 }


