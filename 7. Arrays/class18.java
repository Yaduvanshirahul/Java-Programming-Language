public class class18
{
    public static int BuyAndSell(int price[])
    {
        int buyprice = Integer.MAX_VALUE;   /// positive infinite value
        int maxiprofit = 0;

        for(int i = 0 ; i<price.length;i++)
        {
            if(buyprice<price[i])
            {
                    int profit = price[i] - buyprice;

                    maxiprofit = Math.max(maxiprofit, profit);
            }
            else
            {
                buyprice = price[i];
            }
        }
          
             return maxiprofit;
            
    }
    public static void main(String[] args) {
        
        int price[] = { 7 , 1 , 5 ,3 , 6 , 4};

        System.out.println(BuyAndSell(price));
    }
} 