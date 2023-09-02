//   BINARY SEARCH IN ARRAY

public class class11 {
    
    public static int BinarySearch(int number[] , int key)
    {
        int start = 0 , end = number.length-1;
        
         
        while(start <= end){

            int mid = (start + end)/2;
        
            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
            
        }
        return -1;
    }
        

public static void main(String[] args) {
    
    int number[ ]= {3,5,6,7,8,9};
    int key = 7;
     
    int result = BinarySearch(number , key);
    if(result!=-1){
        System.out.println("element is found at position "+ result);
    }
    else{
         System.out.println("element is not present in array " );
    }  
}
}

