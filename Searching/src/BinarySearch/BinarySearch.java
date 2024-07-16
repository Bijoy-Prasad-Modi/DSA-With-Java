package BinarySearch;

public class BinarySearch {

    // ⭐Binary Search only possible in sorted Arrays

    public static void main(String[] args) {

        int [] arr = {8, 5, 89, 92, 15, -1, -7, 0, 56, 47};
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println("the targeted element is :"+ ans);

    }

    //return the index
    //return -1 if target element does not exist in the array
    static  int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start < end ){
            //find the middle element
            //int mid = (start + end) / 2; //it might possible that 👈 this start + end thing we are doing might exceeds the range of int in java

            //better way to find mid is 👇
            int mid = start + (end - start) /2 ;

            if (target < arr[mid] ){ //means it lies on the left hand side of the mid, then
                end = mid-1 ;
            } else if (target > arr[mid]) { //means target element lies on the right hand side of the mid, then
                start = mid +1;
            } else {
                // target element will == mid
                return mid ; // target found
            }
        }
        //if no condition hit of while loop, means the target is not present in the array in that case just return -1
        return -1;
    }
}
