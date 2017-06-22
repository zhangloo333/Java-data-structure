/**
 * Created by leizha on 6/22/17.
 */
public class counttest {
    public static String count(String input) {
        if(input == null || input.length() == 0) return "";

        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == input.charAt(i-1)) {
                count++;
            } else {
                sb.append(count);
                sb.append(input.charAt(i-1));
                count = 1;
            }
        }

        sb.append(count);
        sb.append(input.charAt(input.length()-1));


        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabbccc";
        System.out.println(count(input));
    }
}
