public class SelectionSort {

    public static int[] doSelectionSort(int[] arr) {
        int minIndex = 0;
        int minValue;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            minValue = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            if (minValue < arr[i]) {
                // swap values
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
