public class Challenge14 {

    /*
    Run-length encoding is a fast and simple method of encoding strings.
    The basic idea is to represent repeated successive characters as a single count and character.
    For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

    Implement run-length encoding and decoding.
    You can assume the string to be encoded have no digits and consists solely of alphabetic characters.
    You can assume the string to be decoded is valid.
     */

    public static String encode(String str){
        int len = str.length();
        int n;
        StringBuilder encodedStr = new StringBuilder();

        for(int i = 0; i < len; i++){
            n = 1;
            while(i < len-1 && str.charAt(i) == str.charAt(i + 1)){
                n++;
                i++;
            }
            encodedStr.append(n).append(str.charAt(i));
        }

        return encodedStr.toString();
    }

    public static String decode(String str){
        StringBuilder decodedStr = new StringBuilder();
        int len = str.length();

        for(int i = 0; i < len; i += 2){
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            while(n > 0){
                decodedStr.append(str.charAt(i + 1));
                n--;
            }
        }

        return decodedStr.toString();
    }

    public static void main(String[] args) {
        String s = "AAAABBBCCDAA";

        System.out.println(encode(s));
        System.out.println(decode(encode(s)));
    }
}
