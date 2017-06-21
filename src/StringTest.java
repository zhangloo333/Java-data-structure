import java.util.Arrays;
import java.lang.StringBuffer;

/**
 * Created by leizha on 6/20/17.
 */
public class StringTest {

    public static String reverse(String str) {
        char [] in = str.toCharArray();
        int begin = 0;
        int end = str.length();
        char mid;

        while(begin > end) {
            mid = in[begin];
            in[begin] = in[end];
            in[end] = mid;
            begin++;
            end--;
        }
        return new String(in);
    }

    public static void main(String[] args) {
        //方法一
        String ss = "hello wor";
        System.out.println("ss is " + ss);

        //方法二
        String ss1 = new String("asvbb");
        System.out.println("ss1 is " + ss1);

        //方法三
        char[] value = {'a','b','c','d'};
        String ss2 = new String(value,1,2);
        System.out.println("ss2 is " + ss2);


        //to upper case
        String ss3 = "hello wor";
        String ss4 = ss3.substring(0,1).toUpperCase().concat(ss3.substring(1));
        System.out.println("ss4 is " + ss4);

        String [] strArray = ss3.split("");

        System.out.println("strArray is " + Arrays.toString(strArray));

        int a=42;
        StringBuffer sb = new StringBuffer(40);
        String ss5 = sb.append("a=").append(a).append("!").toString();
        System.out.println("ss5 is " + ss5);

        // string reverse
        String ss6 = new StringBuilder("1234567").reverse().toString();
        System.out.println("ss6 is " + ss6);

        String ss7 = "654321";
        ss7 = reverse(ss7);
        System.out.println("ss7 is " + ss7);



    }
}
