package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int [][]arr={
                {1, 2, 3},
                {4, 5, 6, 13},
                {7, 8, 99, 12},
                {11, 22, 33}
        };
        int target = 22 ;
        int[] ans = search(arr, target); //
       // System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search (int [][]arr, int target){
        for(int row= 0; row<arr.length; row++){
            for (int col= 0; col< arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col} ;
                }
            }
        }
        return new int[]{-1, -1};
    }


    static int max(int [][]arr){
        int max = Integer.MIN_VALUE;

        //enhanced for loop
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }

        //normal for loop
//        for(int row= 0; row<arr.length; row++){
//            for (int col= 0; col< arr[row].length; col++){
//                if(arr[row][col] >max){
//                    max = arr[row][col] ;
//                }
//            }
//        }
        return max;
    }
}
