package list;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("MySQL");
        list.add("MySQL");
        
        //在某个索引位置插入元素
        list.add(2,"HTML");
        System.out.println(list);

        //根据索引删除元素，返回被删除元素
        System.out.println(list.remove(2));
        System.out.println(list);

        //根据索引获取元素
        System.out.println(list.get(2));

        //根据索引修改元素,返回修改前的数据
        System.out.println(list.set(1, "高斯林"));
        System.out.println(list);
    }
}
