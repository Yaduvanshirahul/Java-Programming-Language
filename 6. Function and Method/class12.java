//  CONVERT BINARY NUMBER TO DECIMAL NUMBER  

public class class12 {
    
    public static void binTOdeci(int binNUM)
    { 
         int myNUM =  binNUM ;
         int dec = 0;
         int pow = 0;
         

         while(binNUM > 0)
         {
            int lastdigit = binNUM%10;

             dec = dec +( lastdigit * (int)Math.pow(2,pow));
             pow++;
             binNUM= binNUM/10;
         }
         System.out.println("change the decimail " + myNUM + " to binary no. "  +  dec);
         return;
    }
    public static void main(String[] args) {

        binTOdeci(101110);
        
    }
}
