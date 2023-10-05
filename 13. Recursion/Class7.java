public class Class7 {

    public static int firstOccur(int arr[], int i, int key) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccur(arr, i + 1, key);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 7, 5, 7, 1, 8, 4 };
        System.out.println(firstOccur(arr, 0, 9));
    }
}
