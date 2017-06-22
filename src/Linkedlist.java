/**
 * Created by leizha on 6/22/17.
 */

import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");

        LinkedList<String> lList2 = new LinkedList<String>();
        lList2.add("6");
        lList2.add("7");
        lList2.add("8");
        lList2.add("9");
        lList2.add("10");

        //add 添加成功可以返回true
        System.out.println(lList.add("5"));
        //add first
        lList.addFirst("start");
        System.out.println("addFist= " + lList);

        System.out.println("offerFist = 返回类型" + lList.offerFirst("start1"));
        System.out.println("addFist= " + lList);

        //add the last
        lList.addLast("end");
        System.out.println("addlast = " + lList);

        //offer the last
        System.out.println("offerlast = 返回类型" + lList.offerLast("end2"));
        System.out.println("addlast = " + lList);

        //addAll 函数
        lList.addAll(lList2);
        System.out.println(lList);

        //push 函数的调用：
        lList.push("www");
        System.out.println("push the www = " + lList);

        //pop 函数的调用：
        lList.pop();
        System.out.println("pop " + lList);

        Object scopy = lList.clone();

        //

        List subl = lList.subList(1,4);
        System.out.println("sublist is " + subl);
    }
}
