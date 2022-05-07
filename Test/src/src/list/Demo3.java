package list;

import java.util.LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        //栈
        LinkedList<String> stack = new LinkedList<>();
        //压栈、入栈
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);
        //出栈、弹栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("---------------------------");

        //队列
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
