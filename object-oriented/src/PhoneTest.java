public class PhoneTest {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="小米";
        p.price=4599;
        System.out.println(p.price);
        System.out.println(p.brand);
        p.call();
        p.playGame();
        Phone p2=new Phone();
        p2.price=10399;
        p2.brand="苹果";
    }
}
//public class 类名{
//1.变量；
//2.方法;
//}
//class可以多，但是public只能有一个
