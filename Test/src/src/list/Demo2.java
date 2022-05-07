package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2  {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");

        System.out.println("-------------------");
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }

        System.out.println("------------------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------------------------");
        for (String ele : list) {
            System.out.println(ele);
        }

        System.out.println("--------------------");
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
