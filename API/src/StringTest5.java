import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str1 = sc.next();
        int bigCount = 0, smallCount = 0, numberCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(c>='a'&&c<='z'){
                smallCount++;
            }
            else if(c>='A'&&c<='Z'){
                bigCount++;;
            }
            else if(c>='0'&&c<='9'){
                numberCount++;
            }
        }
        System.out.println("小写字母有"+smallCount+"个");
        System.out.println("大写字母有"+bigCount+"个");
        System.out.println("数字字母有"+numberCount+"个");

    }
}
