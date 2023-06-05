package testbed;

public class Project6 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 2, 1, 8};
        int low = 0;
        int high = arr.length - 1;

        int maxPosition = getMaxPosition(arr, low, high);
        int maxValue = arr[maxPosition];
        int minPosition = getMinPosition(arr, low, high);
        int minValue = arr[minPosition];

        int secondSmallestValue = getSecondSmallestValue(arr, minValue);


        System.out.println("Maximum value: " + maxValue);
        System.out.println("Position of maximum value: " + maxPosition);
        System.out.println("Second smallest value: " + secondSmallestValue);


    }

    private static int getMinPosition(int[] arr, int low, int high) {

        int minIndex = arr[low];
        for (int i = 0; i <= arr.length -1; i++) {
            if ( arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMaxPosition(int[] arr, int low, int high) {

        int maxIndex = low;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int getSecondSmallestValue(int[] arr, int minValue) {
        int secondSmallestValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minValue && arr[i] < secondSmallestValue) {
                secondSmallestValue = arr[i];
            }
        }
        return secondSmallestValue;


    }
}
