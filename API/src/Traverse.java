import java.util.Scanner;

public class Traverse {
    public static void main(String[] args) {
        //public char charAt(int index)
        //根据索引返回字符（类似数组）
        //public int length() 返回字符串的长度
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            //i即是字符串的索引
            char c = s1.charAt(i);
            System.out.println(c);
        }
    }
}
