package genericity;

public class Demo2 {
    public static void main(String[] args) {
        String[] name = {"a","b","c"};
        printArray(name);

        Integer[] ages = {10, 20, 30};
        printArray(ages);
    }

    public static <T> void printArray(T[] arr){
        if (arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            System.out.println(sb);
        }else {
            System.out.println(arr);
        }
    }
}
