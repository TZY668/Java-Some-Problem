import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 请输入字符串 ");
        String str1 =sc. next();
        String str2="sbc";
        System.out.println(str1==str2);
        // 基本数据类型比较数值
        //引用数据类型比较地址
        //equals完全一样才是true，否则为false
        //equalslgnoreCase忽略大小写的比较
        //上面的都是布尔类型的
    }
}
