package regex;

import java.util.Scanner;

public class RegexDemo2 {
    public static void main(String[] args) {
        //校验 手机号 邮箱 电话号码
        //checkPhone();
        //checkEmail();
        checkTal();
    }

    public static void checkTal() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入电话号：");
            String phone = sc.next();
            if (phone.matches("0\\d{2,6}-?\\d{5,20}")) {
                System.out.println("正确！");
                break;
            } else {
                System.out.println("错误");
            }
        }
    } public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入邮箱：");
            String phone = sc.next();
            if (phone.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("正确！");
                break;
            } else {
                System.out.println("错误");
            }
        }
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入手机号：");
            String phone = sc.next();
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("正确！");
                break;
            } else {
                System.out.println("错误");
            }
        }
    }
}
