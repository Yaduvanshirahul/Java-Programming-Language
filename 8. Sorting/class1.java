//   BUBBLE SORT  

public class class1 {
    public static void BubbleSort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {

            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                // SWAPPING VALUE

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;
                }
            }
            System.out.println("no. of swap in per iteration " + swap);
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };

        BubbleSort(arr);
        PrintArray(arr);

    }
}