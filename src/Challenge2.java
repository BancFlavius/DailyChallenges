public class Challenge2 {
    public static void main(String[] args) {
        /*
        Given an array of integers, return a new array such that each element at index i
        of the new array is the product of all the numbers in the original array except the one at i.
        */

        int[] array = {3, 2, 1};
        int[] newArray = new int[array.length];

        /*
        in the first for loop the variable k is initialized to 1,
         we get inside the second for loop and check if the index in the first array is the same as the one in the second array, known as newArray
        if the index is different, we multiply k with the other numbers from the first array.
        we get out of the second for loop and insert k in the newArray
        */

        for(int i = 0; i<array.length; i++){
            int k = 1;
            for(int j = 0; j<newArray.length; j++){
                if(i != j){ k *= array[j]; }
            }
            newArray[i] = k;
        }


        //simple print for visualizing the content of the array
        System.out.print("[ ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length -1){ System.out.print(", "); }
        }
        System.out.println(" ]");

        //simple print for visualizing the content of the array
        System.out.print("[ ");
        for(int i = 0; i<newArray.length; i++){
            System.out.print(newArray[i]);
            if(i != array.length -1){ System.out.print(", "); }
        }
        System.out.println(" ]");
    }
}
