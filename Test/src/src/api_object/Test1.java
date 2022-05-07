package api_object;

/**
 * 掌握Object类中的toString方法
 */

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("zsh",'男', 19);
//        String s1 = s.toString();
//        System.out.println(s1);
      //  System.out.println(s.toString());
        //默认可以省略
        System.out.println(s);
    }
}
