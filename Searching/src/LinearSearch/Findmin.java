package LinearSearch;

public class Findmin {
    public static void main(String[] args) {
        int arr[] = {18, 12, -7,3, 14, 18};
        System.out.println(min(arr));
    }

    //return minimum value in the array
    static int min(int []arr){
        // first we are taking or assuming the answer might be at 0th index
        //also assuming arr.length!=0
         int ans = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
