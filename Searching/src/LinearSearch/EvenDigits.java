package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
int []nums = {6,9,12,28,42,4568 };
        System.out.println(findNumbers(nums));
        System.out.println(digits(54683));
    }

    static int findNumbers(int[] nums){
        //assuming arr[] != empty


        int count = 0;
        for(int num : nums){
            if(even(num)){
                count ++;
            }
        }


        return count ;
    }
//function to check whether a number contains even digits or not
     static boolean even(int num) {
        int numberOfDigits = digits(num);
         return numberOfDigits % 2 == 0;
     }

    static int digits (int num){
        if(num<0){
            num = num * -1;
        }
int count = 0;
while (num>0){
    count++;
    num = num / 10;

}return count;
    }
}
