package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Dome3 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("小昭");
        lists.add("素素");
        lists.add("灭绝");
        System.out.println(lists);

        Iterator<String> it = lists.iterator();
//        String ele = it.next();
//        System.out.println(ele);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

//        while (it.hasNext()){
//            String ele = it.next();
//            System.out.println(ele);
//        }

//        for (String ele:lists) {
//            System.out.println(ele);
//        }

//        lists.forEach(s -> System.out.println(s));
        lists.forEach(System.out::println);



        System.out.println("----------------------");
    }
}
