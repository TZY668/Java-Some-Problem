package b04excent;

public class Test {
    public static void main(String[] args) {
        Zi z=new Zi();
        System.out.println(z);
        z.ziShow();
        z.fuShow1();
        z.fuShow2();
    }
}
//虚方法表
//非private,非static,非final
// 会交给子类
//成员方法私有的不会继承，而公有的会继承

