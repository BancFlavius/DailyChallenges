public class Challenge6 {
    /*
    Give the mapping a=1, b=2,...z=26, and an encoded message, count the number of ways it can be decoded.
    For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
    You can assume that the messages are decodable. For example, '001' is not allowed.
     */
    public static void main(String[] args) {
        System.out.println(decode("11121"));
    }

    static int decode(String message){
        if(message == null || message.length() == 0) return 0;

        int len = message.length();
        int[] dc = new int[len+1];
        dc[0] = 1;
        dc[1] = message.charAt(0) != '0' ? 1 : 0;

        for(int i = 2; i <= len; i++){
            int first = Integer.valueOf(message.substring(i-1, i));
            int second = Integer.valueOf(message.substring(i-2,i));
            if(first >= 1 && first <=9){
                dc[i] += dc[i-1];
            }
            if(second >= 10 && second <= 26){
                dc[i] += dc[i-2];
            }
        }
        return dc[len];
    }
}
