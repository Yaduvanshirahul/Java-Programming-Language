//                  BINOMIAL COEFFICIENT

public class class7{

    public static int factorial(int r ){

        int fact = 1;
        int i;
        for(i=1;i<=r;i++){
        fact = fact*i;
       
        }
     //System.out.println(   fact);

    return fact;
    }

public static int binfactorial(int n , int r){

int n_fact = factorial(n);
int r_fact = factorial(r);
int nmrfact = factorial(n-r);

int bincoeff = n_fact/(r_fact*nmrfact);

return bincoeff;
}

    public static void main(String[] args) {

       
        System.out.println(binfactorial(5, 3));

        
    }
}