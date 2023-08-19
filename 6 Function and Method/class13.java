//   CONVERT DECIMAL NUMBER TO BINARY NUMBER 

public class class13 {
    
    public static void binTOdeci(int decimal)
    {
        int num = decimal;
        int pow = 0;
        int binary = 0;

        while (decimal>0)
        {
            int rem = decimal%2;
        binary = binary + (rem*(int)Math.pow(10, pow));

            pow++;
            decimal = decimal/2;
        }
        System.out.println("decimal to  "+ num + " to binary no. is "+ binary);
    }
    public static void main(String[] args) {
        
    binTOdeci(9);
}
}