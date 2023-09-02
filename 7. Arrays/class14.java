//  MAKE THE SUBARRAY OF ALL ELEMENT OF ARRAY 

public class class14 {
    
    public static void SubArray(int number[])
    {
          int pair = 0;

          for(int i =0;i<number.length;i++)
          {
            int start = i;
            for(int j = i;j<number.length;j++)
            {
                int end= j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(number[k] + " ");
                }
                
                pair++;
                System.out.println();
            }
            System.out.println();
           
          }
           System.out.println(pair);
        }
    public static void main(String[] args) {
        
        int number[] = { 3 , 6 , 2 , 5 , 7};
        SubArray(number);
    }
}
