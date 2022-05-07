package api_stringbuilder;

/**
 * 使用StringBuilder操作字符串
 */

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append('b');
        sb.append('c');
        System.out.println(sb);

        //支持链式编程
        StringBuilder sb1 =new StringBuilder();
        sb1.append('a').append('b').append('c');
        System.out.println(sb1);

        //反转
        sb1.reverse().append(111);
        System.out.println(sb1);
        System.out.println(sb1.length());

        //StringBuilder只是拼接字符串的手段，效率好
        //最后还是要恢复成String类型.

        //恢复为String类型
        String rs = sb1.toString();
    }
}
