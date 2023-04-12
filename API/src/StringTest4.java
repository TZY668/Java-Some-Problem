import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2="abc";
        System.out.println(s1.equalsIgnoreCase(s2));
    //键盘输入本质是new了一个
    }
}
