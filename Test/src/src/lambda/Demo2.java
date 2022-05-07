package lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
//        Integer[] ages1 = {34, 12, 42, 23};
//        Arrays.sort(ages1, new Comparator<>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                //指定比较规则
//                return - (o1 - o2);
//            }
//        }


//        Integer[] ages1 = {34, 12, 42, 23};
//        Arrays.sort(ages1, (Integer o1, Integer o2) -> {
//                return - (o1 - o2);
//            }
//        );
//        System.out.println(Arrays.toString(ages1));

        Integer[] ages1 = {34, 12, 42, 23};
        Arrays.sort(ages1, ( o1,  o2) ->  o2 - o1);
        System.out.println(Arrays.toString(ages1));

        JFrame win = new JFrame("登录界面");
        JButton bth = new JButton("我是个垃圾");
//        bth.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("有人点我");
//            }
//        });

//        bth.addActionListener((ActionEvent e) -> {
//                System.out.println("有人点我");
//            }
//        );

        bth.addActionListener( e -> System.out.println("有人点我"));

        win. add(bth);
        win.setSize(400,300);
        win.setVisible(true);
    }
}
