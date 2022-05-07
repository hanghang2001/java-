package genericity;

public class Demo1 {
    public static void main(String[] args) {
        //泛型设计
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java");
        list.add("java");
        list.add("java2");
        list.remove("java2");
        System.out.println(list);

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(23);
        list1.add(24);
        list1.add(25);
        list1.remove(25);
        System.out.println(list1);
    }
}
