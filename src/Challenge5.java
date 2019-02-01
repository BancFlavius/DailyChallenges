public class Challenge5 {
/*
Find the first and last element in an array.
This can be easily done for an ArrayList just by changing the parameters of the methods,
and changing .length method to .size method accordingly.
 */
    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 5,2, -1, 3};
        System.out.println("First element in the array: "+getFirstElement(myArray));
        System.out.println("Last element in the array: "+getLastElement(myArray));
    }


    static int getFirstElement(int[] intArray){
        int temp = 0;
        for(int i = 0; i < intArray.length; i++){
            if(i == 0){
                temp = intArray[i];
            }
        }
        return temp;
    }

    static int getLastElement(int[] intArray){
        int temp = 0;
        for(int i = 0; i < intArray.length; i++){
            if(i == intArray.length-1){
                temp = intArray[i];
            }
        }
        return temp;
    }
}
