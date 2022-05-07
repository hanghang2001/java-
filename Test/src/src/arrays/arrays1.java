package arrays;

import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 7, 6};
        //输出内容
        System.out.println(Arrays.toString(arr));

        //排序(默认升序)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分查找(排好序)
        int index = Arrays.binarySearch(arr, 6);
        System.out.println(index);
        int index1 = Arrays.binarySearch(arr, 55);
        System.out.println(index1);

    }
}
