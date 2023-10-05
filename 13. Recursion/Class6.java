// CHECK GIVEN ARRAY IS SORTED OR NOT

public class Class6 {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 5, 8 };

        // int arr[] = { 3, 2, 6, 1, 7 };
        System.out.println(isSorted(arr, 0));
    }
}
