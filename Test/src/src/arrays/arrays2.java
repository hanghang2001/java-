package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class arrays2 {
    public static void main(String[] args) {
        //自定义数组的排序规则
        //降序
        Integer[] ages1 = {34, 12, 42, 23};
        Arrays.sort(ages1, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //指定比较规则
                return - (o1 - o2);
            }
        });
        System.out.println(Arrays.toString(ages1));
        System.out.println("-----------------------------");
        Student[] students = new Student[3];
        students[0] = new Student("张三",23,180);
        students[1] = new Student("李四",24,181);
        students[2] = new Student("王五",22,175);
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
