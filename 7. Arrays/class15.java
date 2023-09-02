///  FIND THE MAXIMUM SUBARRAY SUM VALUE IN  AN ARRAY

public class class15 {

    public static void MaxSubarray(int number[])
    {
       
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            int start = i;
            for(int j=i;j<number.length;j++)
            {
                int last=j;
                int currsum = 0;
                for(int k=start;k<=last;k++)
                {
                    currsum = currsum+ number[k];
                }
                 System.out.println(currsum);
                 System.out.println();
                    if(maxsum<currsum){

                       maxsum = currsum;
                    }
                   
                }

            }
        
        System.out.println("the maximum sum value of a subarray is "+ maxsum);
    }

    public static void main(String[] args) {
        
        int number[] = { 3 , 6 , 2 , 7 , 8};

        MaxSubarray(number);
    }
    
}
