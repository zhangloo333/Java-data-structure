/**
 * Created by leizha on 6/22/17.
 */
public class countRepeatNumber {
    public static String count(String input) {
        if(input == null || input.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == input.charAt(i-1)) {
                count++;
            } else{
                sb.append(count);
                sb.append(input.charAt(i));
            }
        }

        sb.append(count);
        sb.append(input.charAt(input.length()-1));


        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aaaa";
        System.out.println(count(input));
    }

}
