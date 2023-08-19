//   LINEAR SEARCH IN ARRAY

public class class8 {

    public static int linearsearch(int marks[] , int key)
    { 

        int i;
           for( i=0;i<marks.length; i++)
           {
              if(marks[i]==key)
              {
                return i;
              }
            }

              
                return -1;
              
           }
    
    public static void main(String[] args) {
        
        int marks[] ={3 , 5, 1 , 6, 7};
        int key = 7; 
        
        int index = linearsearch(marks, key);
        
        if(index ==-1)
        {
            System.out.println("element not present");
        }
          else{
            System.out.println("element is present at "+ index);
          }
    }
    
    
}
