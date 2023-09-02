//  DIAGONAL SUM OF 2-D ARRAY USING LOGICAL  METHOD OR MINIMIZE TIME COMLEXITY METHOD 

public class class5 {

    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            // PRIMARY DIAGONAL SUM
            sum += matrix[i][i];

            // SECONDARY DIAGONAL SUM
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(DiagonalSum(matrix));

    }
}
