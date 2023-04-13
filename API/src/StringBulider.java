import java.util.Scanner;

public class StringBulider {
    public static void main(String[] args) {
      /*  StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb);
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int len =sb.length();
        System.out.println(len);
        String s1=sb.toString();
        sb.append("123").append(456).append(213321);
        System.out.println(sb);*/
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
      String result=new StringBuilder().append(str).reverse().toString();
//        System.out.println(result);
        if(str.equals(result)){
            System.out.println("当前是对称的");
        }
        else
        {
            System.out.println("当前不是对称的");
        }
    }
}

