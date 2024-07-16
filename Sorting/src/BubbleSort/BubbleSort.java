package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 8, 3, 1};
        //int[] arr = {1, 2, 3, 4, 5, 6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        //for outer loop array is going to run till arr.length-1 (N - 1)
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //there will be an inner loop, that is going to be run for every pass or every value of i, No. of time = N - i -1 times
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
