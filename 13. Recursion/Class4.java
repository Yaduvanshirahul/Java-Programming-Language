//  PRINT NATURAL FORM 1 TO N IN INCREASAING ORDER

public class Class4 {
    
    public static void printNUMinc(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        printNUMinc(n-1);
        System.out.println(n);
    }

    public static void main(String args[]){
        printNUMinc(15);
    }
}
