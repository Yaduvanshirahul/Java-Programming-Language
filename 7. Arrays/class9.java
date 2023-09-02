//    FIND  LARGEST VALUE IN ARRAY

public class class9 {

    public static int LargestValue(int number[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0 ;i<number.length;i++)
        {
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        
        int number[] = { 2,5,9,6,4};
        int max = LargestValue(number);

        System.out.println("Largest value in array is "+ max);
    }
}
