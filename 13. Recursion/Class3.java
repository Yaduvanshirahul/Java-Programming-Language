//  PRINT NUMBER FROM N TO 1  IN DECREASING ORDER

public class Class3 {
    
    public static void printNUMdec(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNUMdec(n-1);
    }

    public static void main(String args[]) {

        printNUMdec(10);
    }
}
