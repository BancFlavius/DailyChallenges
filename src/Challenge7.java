public class Challenge7 {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 6, 2, 5};
        System.out.println(MaxSum(arr));
    }

    static int MaxSum(int arr[]){
        int len = arr.length;
        int incl = arr[0];
        int excl = 0;
        int exclNew;

        for(int i = 1; i < len; i++){
            exclNew = (incl > excl) ? incl : excl;

            incl = excl + arr[i];
            excl = exclNew;
        }

        return ((incl > excl) ? incl : excl);
    }
}
