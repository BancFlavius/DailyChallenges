import java.util.HashSet;
import java.util.Set;

public class Challenge11 {

    /*
    Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list.
    If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.

    For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].
     */

    static String getWords(String sentence, Set<String> list){
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder(sentence);
        int start=0, end=sentence.length(), counter=2;

        while(counter <= end){
            if(list.contains(sb.substring(start,counter))){
                result.append(sb.substring(start,counter)+" ");
                sb.delete(start,counter);
                counter=2;
                end=sb.length();
            }
            else { counter++; }
        }

        return  result.toString();
    }

    public static void main(String[] args) {
        Set<String> list2 = new HashSet<>();
        list2.add("quick");
        list2.add("brown");
        list2.add("the");
        list2.add("fox");
        String sentence2 = "thequickbrownfox";
        System.out.println(getWords(sentence2, list2));

        Set<String> list = new HashSet<>();
        list.add("bed");
        list.add("bath");
        list.add("bedbath");
        list.add("and");
        list.add("beyond");
        String sentence = "bedbathandbeyond";

        System.out.println(getWords(sentence, list));
    }
}
