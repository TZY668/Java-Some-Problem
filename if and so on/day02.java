import java.net.SocketImpl;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
//        int wine;
//        Scanner sc=new Scanner(System.in);
//
//
//        System.out.println("请输入你的酒量");
//        wine=sc.nextInt();
//        switch(wine){
//            case 1:
//                System.out.println("嘻嘻^ ^");
//                break;
//            case 2:
//                System.out.println("哭了");
//                break;
//            default:
//                System.out.println("震惊");
//                break;
        int text;
        Scanner sc = new Scanner(System.in);
        text = sc.nextInt();
        switch (text) {
            case 1 -> System.out.println("一");

            case 2 -> System.out.println("二");

            case 3 -> System.out.println("三");

            default-> System.out.println("一");

//switch在JDK12后面的新特性
            //后面用{}和if的结果相差不大.
        }

    }
}
//switch的表达式要注意；
//case后面加的是比较值；
//记得加break，不然会一直运行到；
//case 后面只能是字面量且不能重复;
//default 可以省略并且放在那里无所谓，最好放在最后一位
//switch


