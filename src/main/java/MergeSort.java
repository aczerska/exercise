public class MergeSort {

    public static int[] mergeSort(int[] a, int n) {
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergeSort(l,mid);
        mergeSort(r,n-mid);

        merge(a,l,r,mid,n-mid);

        return a;
    }

    public static void merge(int[] a, int[] l, int[] r, int lengthL, int lengthR) {
        int i = 0, j = 0, k = 0;
        while ( i < lengthL && j < lengthR) {
            if (l[i] < r[j]) {
                a[k] = l[i];
                i++;
                k++;
            } else {
                a[k] = r[j];
                j++;
                k++;
            }
        }

        while (i < lengthL) {
            a[k] = l[i];
            k++;
            i++;
        }

        while (j < lengthR) {
            a[k] = r[j];
            k++;
            j++;
        }
    }
}
