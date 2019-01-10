public class SecondSmallest {

    public static int findSecondSmallest(int[] arr) throws Exception {
        int secondSmallest;
        int smallest;

        if (arr.length < 2) {
            throw new Exception();
        }

        if (arr[0] < arr[1]) {
            smallest = arr[0];
            secondSmallest = arr[1];
        } else {
            smallest = arr[1];
            secondSmallest = arr[0];
        }

        for (int i = 2; i < arr.length; ++i) {
            if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
                if (secondSmallest < smallest) {
                    secondSmallest = smallest;
                    smallest = arr[i];
                }
            }
        }
        return secondSmallest;
    }

    public static int findSecondSmallestOther(int[] arr) throws Exception {
        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        int counter = 0;
        if (arr.length < 2) {
            throw new Exception();
        }

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
                counter = 1;
            } else if (smallest == arr[i]) {
                counter++;
            }
        }
        if (counter >= 2) {
            return smallest;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}


