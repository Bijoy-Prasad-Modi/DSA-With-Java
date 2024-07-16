package BinarySearch2dArr;

import java.util.Arrays;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(search(matrix, 2)));
    }

    //search in the row and in between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            //find the middle element
            //int mid = (start + end) / 2; //it might possible that 👈 this start + end thing we are doing might exceeds the range of int in java

            //better way to find mid is 👇
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }  if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

//    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
//        while (cStart <= cEnd) {
//            int mid = cStart + (cEnd - cStart) / 2;
//            if (matrix[row][mid] == target) {
//                return new int[]{row, mid};
//            }
//            if (matrix[row][mid] < target) {
//                cStart = mid + 1;
//            } else {
//                cEnd = mid - 1;
//            }
//        }
//        return new int[]{-1, -1};
//    }


    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious, here matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
       }

        if (rows == 1) { //if we have only one element
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0; //we can also do this column wise
        int rEnd = rows - 1;   //here we are eliminating rows, but we can also do this by eliminating columns
        int cMid = cols / 2;
        //run the loop till 2 rows are remaining

        while (rStart < (rEnd - 1)) { //while this is true it will have more than two rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) { //ignoring the above rows
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }


        //now as we have two rows
        //check whether the target is in the column of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        //Otherwise
        //search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart , cMid + 1, cols - 1, target);
        }
        //search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        //search in 4th half
//        if (target >= matrix[rStart + 1][cMid + 1]) {
//            return
//        } // or you can just use else statement
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }



//    static int[] search(int[][] matrix, int target) {
//        int rows = matrix.length;
//        int cols = matrix[0].length; // be cautious, matrix may be empty
//        if (cols == 0){
//            return new int[] {-1,-1};
//        }
//        if (rows == 1) {
//            return binarySearch(matrix,0, 0, cols-1, target);
//        }
//
//        int rStart = 0;
//        int rEnd = rows - 1;
//        int cMid = cols / 2;
//
//        // run the loop till 2 rows are remaining
//        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
//            int mid = rStart + (rEnd - rStart) / 2;
//            if (matrix[mid][cMid] == target) {
//                return new int[]{mid, cMid};
//            }
//            if (matrix[mid][cMid] < target) {
//                rStart = mid;
//            } else {
//                rEnd = mid;
//            }
//        }
//
//        // now we have two rows
//        // check whether the target is in the col of 2 rows
//        if (matrix[rStart][cMid] == target) {
//            return new int[]{rStart, cMid};
//        }
//        if (matrix[rStart + 1][cMid] == target) {
//            return new int[]{rStart + 1, cMid};
//        }
//
//        // search in 1st half
//        if (target <= matrix[rStart][cMid - 1]) {
//            return binarySearch(matrix, rStart, 0, cMid-1, target);
//        }
//        // search in 2nd half
//        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
//            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
//        }
//        // search in 3rd half
//        if (target <= matrix[rStart + 1][cMid - 1]) {
//            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
//        } else {
//            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
//        }
//    }
}
