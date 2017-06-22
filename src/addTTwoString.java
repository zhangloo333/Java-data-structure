/**
 * Created by leizha on 6/22/17.
 */
public class addTTwoString {
    public static String stringAdd(String [] strs) {
        if(strs == null || strs.length ==0) return "";
        if(strs.length ==1) {
            return strs[0];
        }
        String out = strs[0];

        for(int i = 1; i < strs.length; i++) {
            out = addSting(out,strs[i]);
        }

        return out;
    }

    private static String addSting(String in1, String in2) {
        StringBuilder sb = new StringBuilder();
        int len1 = in1.length()-1;
        int len2 = in2.length()-1;
        int curry = 0;

        while (len1 >= 0 && len2 >= 0) {
            int sum = Integer.valueOf(in1.charAt(len1)-'0') + Integer.valueOf(in2.charAt(len2)-'0') +curry;
            sb.insert(0,sum%10);
            curry = sum/10;
            len1--;
            len2--;
        }

        while(len1 >= 0) {
            int sum = Integer.valueOf(in1.charAt(len1) - '0') + curry;
            sb.insert(0,sum%10);
            curry = sum/10;
            len1--;
        }

        while(len2 >= 0) {
            int sum = Integer.valueOf(in2.charAt(len2) - '0') + curry;
            sb.insert(0,sum%10);
            curry = sum/10;
            len2--;
        }
        if(curry != 0) {
            sb.insert(0,1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"123", "456", "789"};

        System.out.println(stringAdd(strings));
    }
}
