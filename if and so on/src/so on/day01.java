import java.util.Scanner;
public class day01 {
    public static void main(String[] args) {
        int wine=0;
        Scanner sc=new Scanner(System.in);


        System.out.println("请输入你的酒量");
        wine=sc.nextInt();
        if(wine>=2) {
            System.out.println("酒量大于2kg");
        }
        else if(wine==1)
            System.out.println("酒量为1kg");
        else
            System.out.println("酒量小于1kg");
    }
}
//和C语言差距不大，都是表示选择;
//if switch while do while;
//需要注意的反而是开头那个调用和后面的变量的定义比较麻烦;
//if对于bool类型的变量进行判断，不要用==号,直接放在判断正误的括号里面就好了；
//

