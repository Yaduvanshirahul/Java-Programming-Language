public class class12 {
    
    public static void SwapArray(int number[])
    {
           int temp ;
           int start = 0;
           int last = number.length-1;
           while(start<last)
           {
              temp = number[start];
              number[start]= number[last];
              number[last]= temp;

              start++ ;
              last-- ;
           }
           
    }

    public static void main(String[] args) {
        
        int number[]={ 3 , 5 , 7 , 1 , 6};
       
        SwapArray(number);      //  -->>  perform reverse of array by callling the SwapArray function

        for(int i=0;i<number.length;i++)
        {

        System.out.print(number[i]+ " ");

    }
}
}
