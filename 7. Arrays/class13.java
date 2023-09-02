//   MAKE THE PAIR OF ALL THE ELEMENT IN ARRAY 

public class class13 {
    
    public static void Pairs(int number[])
    {
        int pair = 0 ;

        for(int i = 0 ;i<number.length;i++)
        {
        int current = number[i];
        
        for(int j = i+1;j<number.length;j++)
        {
               System.out.print(" ("  + current + " , " + number[j] +")");  
               pair++ ;
        }
        System.out.println();

    }
    System.out.println(pair );
    }

    public static void main(String[] args) {
        
        int number[]= {3 , 5, 6 , 4 , 9};

        Pairs(number);

    }
}
