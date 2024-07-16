package CyclicSort;

//Amazon-Q: Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the arr

public class MissingNumber {

    public int missingNumber(int[] arr) {
        //we will only move i when at the correct index
        //check swap move
        //till you reach at the end of the index
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        //otherwise, else : case 2 --> return N
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
