package regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        //校验qq号码
        System.out.println(checkQQ("343332423"));
        System.out.println(checkQQ("343a"));
        System.out.println(checkQQ("324"));
    }

    public static boolean checkQQ(String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }
}
