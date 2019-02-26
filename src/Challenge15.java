public class Challenge15 {

    /*
    Given an array of strictly the characters 'R', 'G', and 'B',
    segregate the values of the array so that all the Rs come first,
    the Gs come second, and the Bs come last. You can only swap elements of the array.

    Do this in linear time and in-place.

    For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
     */

    public static void organize(String[] strArr){
        int len = strArr.length;
        int lo = 0;
        int hi = len - 1;
        int mid = 0;
        String temp = "";

        while(mid <= hi){
            switch (strArr[mid]){
                case "R":{
                    temp = strArr[lo];
                    strArr[lo] = strArr[mid];
                    strArr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case "G":{
                    mid++;
                    break;
                }
                case "B":{
                    temp = strArr[mid];
                    strArr[mid] = strArr[hi];
                    strArr[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    static void printArray(String arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] strArr =  {"G", "B", "R", "R", "B", "R", "G"};

        organize(strArr);
        printArray(strArr, strArr.length);
    }
}
