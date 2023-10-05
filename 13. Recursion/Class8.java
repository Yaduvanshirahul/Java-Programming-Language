public class Class8 {
    public static int lastOccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isfound = lastOccur(arr, key, i + 1);

        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 1, 7, 5, 6, 3, 4 };
        System.out.println(lastOccur(arr, 5, 0));
    }
}
