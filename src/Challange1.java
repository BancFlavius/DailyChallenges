public class Challange1 {
    public static void main(String[] args) {
        /*
        Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
         */
        long[] array = new long[100];
        long k= 0;

        // Generating  random numbers in the array and generating a random number for the variable k in the last loop
        for(int i = 0; i<array.length; i++){
            array[i]= Math.round(Math.random() * 100);
            if(i == array.length-1){
                k = Math.round(Math.random() *11);
                System.out.println("k = " + k);
            }
        }

        //checking if two numbers in the array are the sum of the variable k
        // after checking if conditions are true, the index and the number from the array is printed in the console
        for(int i = 0; i<array.length; i++){
            for(int j = i; j<array.length; j++){
                long temp = array[i] + array[j];
                if(temp == k && array[i] != array[j]){
                    System.out.println("index is - " + i + " and " + j);
                    System.out.println("numbers are - " + array[i] + " and " + array[j] );
                }
            }
        }

        //simple print for visualizing the content of the array
        System.out.print("[ ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length -1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
