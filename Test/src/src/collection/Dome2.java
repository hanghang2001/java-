package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Dome2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        //增加
        c.add("java");
        c.add("Java");
        System.out.println(c);
        //清空
//        c.clear();
//        System.out.println(c);

        //判断集合是否为空
       // System.out.println(c.isEmpty());

        //获取集合的大小
        System.out.println(c.size());

        //判断集合中是否包含某个元素
        System.out.println(c.contains("java"));

        //删除，重复删除第一个
        System.out.println(c.remove("java"));

        //转换为数组
        Object[] arrs = c.toArray();
        System.out.println(Arrays.toString(arrs));

        System.out.println("--------拓展--------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("美女1");
        c2.add("美女2");
        //把c2里的元素全部倒入c1中
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
