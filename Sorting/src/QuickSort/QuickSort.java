package QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        // Internal sorting algorithm : Arrays.sort(arr);
    }

    static void quickSort(int[] nums, int low, int high) { //void -> because we are not returning a new arr, just making change in the original one
        if (low > high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];

        //putting pivot at correct position
        // this conditions are also a reason, if it's already sorted it will not swap, unlike merge sort algorithm
        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // After putting the pivot at correct position , this is time for recursion call to sort the two halves of the given arr
        // Recursion call 👇
        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}
