//   HOW THE CALL BY VALUE AND REFERENCE WORK ON ARRAY OR SIMPLE DATA  

public class class7 {

    public static void update(int marks[] , int unchangeable)
    {

         unchangeable = 12;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]= marks[i]+1;
        }
    }
    public static void main(String[] args) {
        
        int marks[]= {23 , 24 , 25};
        int unchangeable = 11;          // --->>>  here value of unchangeable is not change after passing value in update

        update(marks , unchangeable);

         System.out.println(unchangeable);

        for(int i=0; i<marks.length;i++)
        {
            System.out.println("After update marks is "+ marks[i]);  /// --->> here value of marks change after passing value in update
        }
       
    }
    
}
