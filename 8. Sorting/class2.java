//   SELECTION SORT   

public class class2 {

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) // FOR DESECNDING ORDER WE JUST OPPOSITE THE OPERATOR
                {
                    minPos = j;
                }
            }
            // SWAPPING

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {

        int arr[] = { 4, 6, 2, 8, 5, };
        selectionSort(arr);
        PrintArray(arr);
    }
}
