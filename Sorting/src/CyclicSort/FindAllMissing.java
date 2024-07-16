package CyclicSort;

//Q - Google : Find all the numbers missing in the array

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public List<Integer>findDisappearNumbers(int[] nums) {
        //we will only move i when at the correct index
        //check swap move
        //till you reach at the end of the index
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        //just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
