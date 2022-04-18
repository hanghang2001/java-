package test1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tast2 {
    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            System.out.println("输出: " + i);
//        }
//        long endtime = System.currentTimeMillis();
//        System.out.println((endtime - time) / 1000.0 + "s");


        //数组拷贝
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr2 = new int[6];
        System.arraycopy(arr1, 3, arr2, 2, 3);
        //被拷贝的数组， 开始位置， 目标数组， 粘贴位置， 拷贝的个数
        System.out.println(Arrays.toString(arr2));
    }
}
