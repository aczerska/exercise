import java.util.ArrayList;

public class InsertionSort {

    public static int[] doInsertionSortArray(int[] arr) {
        int temp, key, j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && key < arr[j]) {
                // swap
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static ArrayList<Integer> doInsertionSortArrayList(ArrayList<Integer> list) {
        int temp, key, j;
        for (int i = 1; i < list.size(); i++) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0 && key < list.get(j)) {
                // swap
                temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                j--;
            }
        }
        return list;
    }
}
