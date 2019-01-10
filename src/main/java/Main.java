import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {2, 8, 10, 15, 1, 0};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(1000);
        list.add(-1);
        list.add(0);

        System.out.println("FINDING NEXT GREATER ELEMENT IN AN ARRAY");
        System.out.println("* Algorithm with sorted array: ");
        NextGreaterElement.nextGreaterElement(arr);
        System.out.println("* Algorithm with Integer.MAX_VALUE declaration for smaller range of values (-10^6 - 10^6): ");
        NextGreaterElement.nextGreaterElementOther(arr);
        System.out.println("* Algorithm for array values in whole range of integers: ");
        NextGreaterElement.nextGreaterElementTotal(arr);
        System.out.println();

        System.out.println("FINDING SECOND SMALLEST VALUE IN AN ARRAY");
        System.out.println("* Algorithm with 1 for loop: ");
        System.out.println(SecondSmallest.findSecondSmallest(arr));
        System.out.println("* Algorithm with 2 for loops: ");
        System.out.println(SecondSmallest.findSecondSmallestOther(arr));
        System.out.println();

        int[] array1 = {2, 8, 10, 15, 1, 0};
        System.out.println("INSERTION SORT ALGORITHM {2,8,10,15,1,0}");
        System.out.println(Arrays.toString(InsertionSort.doInsertionSortArray(array1)));
        System.out.println("INSERTION SORT ALGORITHM (Array List)");
        System.out.println(InsertionSort.doInsertionSortArrayList(list));
        System.out.println();

        int[] array2 = {10, 50, 20, 40, -1};
        System.out.println("SELECTION SORT ALGORITHM {10,50,20,40,-1}");
        System.out.println(Arrays.toString(SelectionSort.doSelectionSort(array2)));
        System.out.println();

        int[] array3 = {-30, -1, 0, 40, 1000};
        System.out.println("BUBBLE SORT ALGORITHM {-30,-1,0,40,1000}");
        System.out.println(Arrays.toString(BubbleSort.doBubbleSort(array3)));
        System.out.println();

        int[] array4 = {200, 4, 20, 11, 0, -15};
        System.out.println("MERGE SORT ALGORITHM {200,4,20,11,0,-15}");
        System.out.println(Arrays.toString(MergeSort.mergeSort(array4, array4.length)));
        System.out.println();

        int[] array5 = {10000, 0, 2, -1, 10, 50};
        System.out.println("1st QUICK SORT ALGORITHM {10000,0,2,-1,10,50}");
        System.out.println(Arrays.toString(QuickSort1.quicksort(array5)));
        System.out.println();

        int[] array6 = {10000, 0, 2, -1, 10, 50};
        System.out.println("2nd QUICK SORT ALGORITHM {10000,0,2,-1,10,50}");
        System.out.println(Arrays.toString(QuickSort2.quickSort(array6)));
    }
}

