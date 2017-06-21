/**
 * Created by leizha on 6/21/17.
 */
import java.util.*;

public class ArrayListDemo {
    public static void main(String args[]) {
        // create an array list
        int [] arr = {1,2,3,4,5,6};
        ArrayList al1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Initial size of al: " + al1.size());



        ArrayList al = new ArrayList(4);
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.size());

        // display the array list
        System.out.println("Contents of al: " + al);

        //add all 的函数
        ArrayList al11 = new ArrayList();
        al11.add("W");
        al11.add("Q");
        al11.add("E");
        al11.add("R");

        al.addAll(1,al11);

        List a = al.subList(0,4);
        System.out.println("Contents of a: " + a);


        // display the array list
        System.out.println("Contents of al: " + al);

        // Remove elements from the array list
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);

        Object[] str = new String[al.size()];
        str = al.toArray();
        System.out.println("Contents of str: " + Arrays.toString(str));
        System.out.println("type of str: " + str.getClass());

        al.clear();
        System.out.println("Contents of al: " + al);

    }
}
