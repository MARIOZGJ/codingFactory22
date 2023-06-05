package gr.aueb.cf.ch6;

public class CircularRotationApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] rotated = doCircularRightShiftBy(arr, 2);
        printArray(rotated);
    }

    /**
     *  Rotates the elements of an array by an offset.
     *
     * @param arr         the given array of integers.
     * @param offset      the distance to ratate.
     * @return             the rotated array, or null if the
     *                     given array is null.
     */
    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if(arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
         return rotated;

        }
        public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int [] rotated = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
        }

    public static void printArray(int [] arr) {
        for (int item : arr) System.out.print(item + " ");
        System.out.println();
    }
}

