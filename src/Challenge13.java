public class Challenge13 {

    /*
    Given a string, find the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word.
    If there is more than one palindrome of minimum length that can be made, return the lexicographically earliest one (the first one alphabetically).

    For example, given the string "race", you should return "ecarace", since we can add three letters to it (which is the smallest amount to make a palindrome).
    There are seven other palindromes that can be made from "race" by adding three letters, but "ecarace" comes first alphabetically.
     */

    static String palindrome(String str){
        char[] strArr = str.toCharArray();
        int len = strArr.length;
        String result = "";

        boolean done = false;
        String temp = "";


        while(!done){
            //going trough the starArr array and getting the last char
            temp = temp + strArr[len-1];
            char[] rev = temp.toCharArray();
            String temp2 ="";
            String str2 ="";

            //reversing the temp string
            for(int i = rev.length; --i >= 0;){ temp2 = temp2 + rev[i]; }

            //reversing the str string
            for(int i = strArr.length; --i >= 0;){ str2 = str2 + strArr[i]; }

            if((temp+str).equals(str2+temp2)){
                done = true;
                result = temp+str;
            }
            len--;
        }


        if(done){
            return result;
        } else {
            return "didn't find a palindrome";
        }
    }

    public static void main(String[] args) {
        String word = "google";

        System.out.println(palindrome(word));
    }
}
