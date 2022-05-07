package api_object;

/**
 * 掌握Object类中的equals方法
 */

public class Tsst2 {
    public static void main(String[] args) {
        Student s1 = new Student("zsh", '男', 19);
        Student s2 = new Student("zsh", '男', 19);
        System.out.println(s1.equals(s2));
    }
}
