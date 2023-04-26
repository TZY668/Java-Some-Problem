package D2;

public class Test1 {
    public static void main(String[] args) {
        final int a=10;
        System.out.println(a);
//        a=20;

    }

}
class FU{
    public  final void show(){
        System.out.println("父类的show方法");
    }
}
class ZI extends FU{
   /* public void show(){
        System.out.println("子类的show方法");
    }*/

}
//final修饰方法则不可以改变
//final修饰类，则不可以被继承
//final修饰变量，则变量变成常量,基本数据类型是数据值不改变
// 而引用数据类型则是地址值不发生改变，内部的属性值抗压改变



