package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
       // int [] arr = {8, 5, 89, 92, 115, 211, 817, 910, 956, 967}; //Ascending order array
        int [] arr = {999, 948, 927, 543, 321, 243, 241,45, 27, 8,3};   //Descending order array
        int target = 45;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int []arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find weather arr is in ascending or descending

//        boolean isAsc;
//        if (arr[start]<arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }

        boolean isAsc = arr[start]<arr[end] ;

        while (start <= end ){
            //find the middle element
            //int mid = (start + end) / 2; //it might possible that 👈 this start + end thing we are doing might exceeds the range of int in java

            //better way to find mid is 👇
            int mid = start + (end - start) /2 ;


            if (arr[mid] == target){
                return mid ;
            }
            if (isAsc) {
                if (target < arr[mid] ){ //means it lies on the left hand side of the mid, then
                    end = mid-1 ;
                } else { //means target element lies on the right hand side of the mid, then
                    start = mid +1;
                }

            } else {
                if (target > arr[mid] ){ //means it lies on the left hand side of the mid, then
                    end = mid-1 ;
                } else { //means target element lies on the right hand side of the mid, then
                    start = mid + 1;
                }
            }


        }
        //if no condition hit of while loop, means the target is not present in the array in that case just return -1
        return -1;
    }
}
