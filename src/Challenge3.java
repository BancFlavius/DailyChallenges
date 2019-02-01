
public class Challenge3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 5};
        System.out.println(getLowestPositiveInteger(arr));
    }

    private static int getLowestPositiveInteger(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; ++i)  {
            int num = arr[i];
            while (num <= n && num > 0 && arr[num - 1] != num) {
                int temp = arr[num-1];
                arr[num-1] = arr[i];
                arr[i] = temp;

                num = arr[i];
            }
        }

        for (int i = 0; i < n; ++i) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
