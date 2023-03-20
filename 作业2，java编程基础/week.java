import java.util.Scanner;
public class week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w = sc.nextInt();
        int yesterday = (w + 6) % 7; // 计算昨天的星期数
        int tomorrow = (w + 1) % 7; // 计算明天的星期数

        System.out.println("今天是星期" + w + "，昨天是星期" + yesterday + "，明天是星期" + tomorrow);
    }
}
