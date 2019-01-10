public class QuickSort2 {

    public static int[] quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (right <= left) {
            return;
        }

        int pivot = arr[(left + right) / 2];
        // partitioning array around pivot
        int index = partitioning(arr, left, right, pivot); // partition returns dividing point between left and right
        // sorting each partitioned side
        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    public static int partitioning(int[] arr, int left, int right, int pivot) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

}
