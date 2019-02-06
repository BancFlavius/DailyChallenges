public class Challenge10 {

    /*
    Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

    For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
     */

    static int findClassrom(int[][] arr){
        int result = 0;
        int arrLength = arr.length;

        for(int i = 1; i < arrLength; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][0] <= arr[1][1]) {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[][] = { {30, 75}, {0, 50}, {60, 150}, {51, 59}, {150, 200} };

        System.out.println(findClassrom(arr));
    }
}
