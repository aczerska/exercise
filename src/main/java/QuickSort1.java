public class QuickSort1 {

    public static int[] quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void quicksort(int[] arr, int left, int right) {
        if (right <= left)
            return;
        else {
            int q = partition(arr, left, right);
            quicksort(arr, left, q - 1);
            quicksort(arr, q + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int x = arr[left];
        int i = left;

        for (int j = left + 1; j <= right; j++)
            if (arr[j] <= x) {
                i = i + 1;
                swap(arr, i, j);
            }
        swap(arr, i, left);
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
