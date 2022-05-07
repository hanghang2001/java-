package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java2");
        list.add("java3");
        System.out.println(list);
        System.out.println("------------------");

        //并发性错误
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String ele = it.next();
//            if ("java2".equals(ele)){
//                it.remove();
//            }
//        }
//        System.out.println(list);
//        System.out.println("----------------------");

//        for (String s : list) {
//            if ("java2".equals(s)){
//                list.remove("java2");
//            }
//        }
//        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if ("java2".equals(ele)){
                list.remove("java2");
                i--;
            }
        }
        System.out.println(list);
    }
}
