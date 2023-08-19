// TYPE PROMOTION

public class class13 {
    
    public static void main(String[] args) {
        
        short a = 4;
        byte b = 23;
        char c = 'b';

        int w = a+b+c;
        byte g = (byte)(a+b+c);  // TYPE PROMOTING

        System.out.println(w);
        System.out.println(g);
    }
}
