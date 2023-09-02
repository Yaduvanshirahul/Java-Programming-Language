//  SPIRAL MATRIX 

public class class3 {

    public static void SpiralMatrix(int matrix[][]) {
        int StartRow = 0;
        int EndRow = matrix.length - 1;
        int StartCol = 0;
        int EndCol = matrix.length - 1;

        while (StartRow <= EndRow && StartCol <= EndCol) {

            // for printing top

            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }

            // for printing right

            for (int i = StartRow + 1; i <= EndRow; i++) {

                System.out.print(matrix[i][EndCol] + " ");
            }

            // for printing bottom

            for (int j = EndCol - 1; j >= StartCol; j--) {
                if (StartRow == EndRow) {
                    break;
                }
                System.out.print(matrix[EndRow][j] + " ");
            }

            // for printing left

            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                if (StartCol == EndCol) {
                    break;
                }
                System.out.print(matrix[i][StartCol] + " ");
            }
            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;

        }
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 3, 4, 2 },
                { 5, 6, 7, 8 },
                { 11, 12, 13, 14 },
                { 9, 10, 15, 16 } };

        SpiralMatrix(matrix);
    }
}
