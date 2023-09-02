///   FIND MINIMUM VALUE IN ARRAY 

public class class10 {
    
    public static int MinimumValue(int number[]){

        int minimum = Integer.MAX_VALUE;
        
        for(int i=0; i<number.length; i++){
            if(minimum>number[i]){
                minimum=number[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        
        int number[]= {3 , 6, 1 ,0, 11};
        int small = MinimumValue(number);

        System.out.println("Minimum value in array "+ small);
    }
}
