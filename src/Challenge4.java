import java.util.Arrays;

public class Challenge4 {
    /*
    Given an array of integers, find the first missing positive integer in linear time and constant space.
    In other words, find the lowest positive integer that does not exist in the array.
    The array can contain duplicates and negative numbers as well.

    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3
     */

    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 5, 2, -1, 3};
        System.out.println(getLowestPositiveInteger(myArray));
    }

    static int getLowestPositiveInteger(int[] intArray){
        Arrays.sort(intArray);
        int temp = 0;

        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] < 0){
                continue;
            } else {
                if (temp == intArray[i]) { temp++; } else { break; }
            }
        }
        return temp;
    }
}
