//   FIND MAXIMUM SUM OF A SUBARRAY WITH TIME COMPLEXITY OF SQUARE  ORDER

public class class16 {
    
    public static void MaxSum(int number[])
    {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[number.length];
        prefix[0] =  number[0];
        
        System.out.println( prefix[0]);

        for(int i=1;i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1]+number[i];
            
            System.out.println( prefix[i]);
        
        }
        System.out.println( );

        for(int i=0;i<number.length;i++)
        {
            int start = i;
            for(int j = i;j<number.length;j++ )
            {
                int last = j;
                currsum = start==0 ? prefix[last] : prefix[last]-prefix[start-1];

                if(maxsum<currsum)
                {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("maxi sum is "+ maxsum);
    }
    public static void main(String[] args) {
        
        int number[] = { 3 , 5, 1 , 6 , 4};
        MaxSum(number);
    }
}
