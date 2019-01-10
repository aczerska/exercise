import java.util.Arrays;

public class NextGreaterElement {

    public static void nextGreaterElement(int[] arr) {
        int length = arr.length;
        int[] copyArr = Arrays.copyOf(arr, length);
        Arrays.sort(copyArr);
        String[] newArray = new String[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i] < copyArr[j]) {
                    newArray[i] = Integer.toString(copyArr[j]);
                    break;
                } else {
                    newArray[i] = "_";
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void nextGreaterElementOther(int[] arr) {
        String[] outArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int bestCand = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i] && arr[j] < bestCand) {
                    bestCand = arr[j];
                }
            }
            if (bestCand == Integer.MAX_VALUE) {
                outArr[i] = "_";
            } else {
                outArr[i] = Integer.toString(bestCand);
            }
        }
        System.out.println(Arrays.toString(outArr));
    }

    public static void nextGreaterElementTotal(int[] arr) {
        String[] outArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int bestCand = 0;
            boolean foundFirstCandidate = false;
            for (int cand : arr) {
                if (cand > arr[i]) {
                    if (!foundFirstCandidate) {
                        foundFirstCandidate = true;
                        bestCand = cand;
                    } else if (cand < bestCand) {
                        bestCand = cand;
                    }
                }
            }
            if (foundFirstCandidate) {
                outArr[i] = Integer.toString(bestCand);
            } else {
                outArr[i] = "_";
            }
        }

        System.out.println(Arrays.toString(outArr));
    }
}



