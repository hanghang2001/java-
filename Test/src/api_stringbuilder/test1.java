package api_stringbuilder;

public class test1 {
    public static void main(String[] args) {
        int[] arr1 = {10, 50, 99};
        System.out.println(toString(arr1));
    }

    public static String toString(int[] arr){
        if (arr != null) {
            //拼接.
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i] ).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append(']');
            return sb.toString();
        }
        else {
            return null;
        }
    }
}

