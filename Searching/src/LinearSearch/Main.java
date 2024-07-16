package LinearSearch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int num [] = {54, 26, 98, 24, 17, 30};
        int target = 98;
        int ans = linearSearch(num, target);
        int ans1 = linearSearch2(num, target);
        System.out.println(ans);
        System.out.println(ans1);
    }


    //search in the array: return the index if item found, otherwise return -1
    static int linearSearch(int []arr, int target){
        if (arr.length==0){ //arrays length is equal to zero then return -1
            return -1;
        }

        //run a for loop
        for (int index=0; index<arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }

        //this will execute if none of the return statement above will execute
        //hence the target not found
        return -1;
    }









    //search the target and return the element itself
    static int linearSearch2(int []arr, int target){
        if (arr.length==0){
            return -1;
        }
        //run a for loop
        for (int index=0; index<arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return element;
            }
        }
        //this will execute if none of the return statement above will execute
        //hence the target not found
        return Integer.MAX_VALUE;
    }








    //search the target and return true or false
    static boolean linearSearch3(int []arr, int target){
        if (arr.length==0){
            return false;
        }
        //run a for loop
        for (int index=0; index<arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return true;
            }
        }
        //this will execute if none of the return statement above will execute
        //hence the target not found
        return false;
    }

}