public class Challenge9 {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 8, 7, 3, 10, 11   };
        int k = 3;
        maxSubarray(arr, k);
    }

    static void maxSubarray(int[] arr, int k){
        int count;
        int counter = 0;
        int n;
        int[] newArr = new int[arr.length];

        if(1 <= k && k <= arr.length){
            for (int i = 0; i < arr.length; i++) {
                if(i == arr.length-k+1) break;
                n = 0;
                count = 0;
                int maxNum = 0;
                for (int j = i; j < arr.length; j++) {
                    if(count == k) break;
                     n = arr[j];
                    if(n > maxNum){
                        maxNum = n;
                    }
                    count++;
                }
                newArr[counter] = maxNum;
                counter++;
            }
        }

        for(int i : newArr){
            if(i != 0) System.out.println(i);
        }
    }
}
