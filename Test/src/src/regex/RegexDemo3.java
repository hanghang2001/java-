package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        String rs = "来黑马程序员学习Java，电话020-43422424，或者联系邮箱"+
                "itcast@itcast.cn,电话18762832633,0203232323"+
                "邮箱bozai@itcast.cn,400-100-3233,4001003232";

        //制定规则
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})" +
                "|(1[3-9]\\d{9})" +
                "|(0\\d{2,6}-?\\d{5,20})" +
                "|(400-?\\d{3,9}-?\\d{3,9})";

        //固定代码，爬取内容
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(rs);

        while (matcher.find()){
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
