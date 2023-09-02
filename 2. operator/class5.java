public class class5 {
    public static void main(String[] args) {
        
        int a = 4;
        int b = 3;
        int c = 2;
        int d = 1;

        System.out.println((a>b)&&(c>d));
        System.out.println((a<b)&&(c>d));

        System.out.println((a<b)||(c<d));
        System.out.println((a<b)||(c>d));

        System.out.println(!(a<b));
        System.out.println( (a<b)||!(c>d));
                

    }
}
