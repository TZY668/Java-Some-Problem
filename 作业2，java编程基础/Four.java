import java.util.Scanner;

public class Testif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个四位整数：");
        int num = input.nextInt();
        int a = num / 1000;  // 千位数
        int b = num / 100 % 10;  // 百位数
        int c = num / 10 % 10;  // 十位数
        int d = num % 10;  // 个位数
        System.out.println(a + "\t" + b + "\t" + c + "\t" + d);
    }
}
//输入四位数
