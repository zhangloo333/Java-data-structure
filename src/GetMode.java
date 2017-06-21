/**
 * Created by leizha on 6/9/17.
 */
import java.util.*;
public class GetMode {
    public static void main(String[] args) {
        GetMode gm = new GetMode();

        int[] arr = {1,2,18,4,5};
        int[] arr2 = new int[5];
        int[] arr3 = new int[6];

        Arrays.fill(arr3,2);
        System.out.println("array3 is " + Arrays.toString(arr3));

        Arrays.sort(arr);
        System.out.println("arr is " + Arrays.toString(arr));



        System.out.println("the 2 element---" + arr[2]);

        print(arr);

        arr2[0] = 100;
        arr2[1] = 200;
        //没有给arr[2] 赋值所以出来的是 arr[2] = 0;
        arr2[3] = 300;
        arr2[4] = 400;


        print(arr2);
        System.out.println("half search " + gm.halfSearch(arr2,300));
        print(arr2);
        System.out.println(gm.getMax(arr));
        System.out.println(gm.getMin(arr));


        //build 2D matrix
        int [][] array2D = new int[3][3];


        for(int i = 0, j=1; i < array2D.length; i++) {
            for(int ii = 0; ii < array2D[0].length; ii++){
                array2D[i][ii] = j++;
            }
        }

        System.out.println(Arrays.deepToString(array2D));


    }




    private static void print(int[] arry) {
        System.out.println("begin to print");

        for(int i = 0; i < arry.length; i++) {

            System.out.print(arry[i] + ", ");
        }
        System.out.println("\n"+"end to print");
    }

    private int getMax(int[] array) {
        int max = array[0];
        for(int i = 1 ; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private int getMin(int[] array) {
        int min = array[0];

        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private int halfSearch(int[] array, int target) {
        int min, max, mid;
        min = 0;
        max = array.length-1;
        mid = (min + max)/2;
        Arrays.sort(array);
        while(array[mid] != target) {
            if(array[mid] > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
            if(min > max) return -1;
            mid = (min + max)/2;

        }
        return mid;
    }
}
