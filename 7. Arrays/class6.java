//    UPDATE THE VALUE OF ARRAY AFTER PASSING THE VALUE IN FUNCTION  USING CALL BY REFERNECE

public class class6 {
     
        public static void update(int marks[])
        {
            for(int i=0;i<3;i++)
            {
                marks[i] = marks[i]+1;
            }
            
        }

        public static void main(String[] args) {
            
            int marks[] ={23, 42, 21};

            update(marks);

            for(int i=0;i<marks.length;i++)
            {

            System.out.println(marks[i]);     ///   ---->>>   VALUES OF ARRAY CHANGE BY 1 AFTER PASSING VALUE OF MARKS IN UPDATE FUNCTION
            }
        }
    }

