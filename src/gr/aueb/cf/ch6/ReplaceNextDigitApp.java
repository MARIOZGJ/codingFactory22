package gr.aueb.cf.ch6;

/**
 * Replace all array digits with
 * the next digit.
 */
public class ReplaceNextDigitApp {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 8};

        printArray(arr);

        shiftLeftByOne( arr,0);//2,9,8,0

        printArray(arr);

    }
    public static void shiftLeftByOne(int[] arr, int low) {
        if (arr == null || low < 0 || low > arr.length) return;

        for (int i = low; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = 0;
    }

    public static void printArray(int [] arr) {
        for (int item : arr) System.out.print(item + " ");
        System.out.println();
    }

}



