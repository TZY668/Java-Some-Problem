import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        //数组的创建
        Goods g1 = new Goods("001", "小米13", 4999, 100);
        Goods g2 = new Goods("002", "保温杯", 89, 50);
        Goods g3 = new Goods("003", "枸杞", 12.9, 80);
        //三个商品对象
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //添加
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getCount() + "," + arr[i].getPrice() + "," + arr[i].getName() + "," + arr[i].getId() + ",");
        }
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        String ling1=sc.nextLine() ;
        String ling2=sc.nextLine();
        System.out.println(ling1);
        System.out.println(ling2);
        第二套体系的测试*/
    }
}
/*键盘录入nextInt;等等
遇到空格制表符回车就停止接收*/
/*
nextling;接收字符串，遇到回车才停止接收数据
*/
//先用nextInt再用nextLine会有弊端例如回车会被nextLine接收数据
