import java.util.Scanner;

public class IDTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //正确的账号
        for (int i = 0; i < 3; i++) {
            String rightUsername = "zhangsan";
            String rightPassword = "123456";
            // 键盘输入
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入密码");
            String Password = sc.next();
            //比较
            if (userName.equals(rightUsername) && Password.equals(rightPassword)) {
                System.out.println("成功");
                break;
            } else {
                if(i==2)
                {
                    System.out.println("账户输入次数完毕");
                    break;
                }
                System.out.println("失败，密码或者用户名有误,您还剩"+(2-i)+"次机会");
            }
        }
    }
}
