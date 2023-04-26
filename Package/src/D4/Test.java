package D4;

public class Test {
    public static void main(String[] args) {
        /*{
            int a=10;}
        System.out.println(a);*/
        Student s=new Student();
    }
}
//局部代码块，也就类似c中的
// 构造代码块,写在成员位置的代码块,可以抽重复的代码
//先执行构造代码块，再执行方法
//一般是创建方法来调用
//静态代码块，static，随着类的加载而加载，自动触发，只执行一次
//一般数据初始化的时候用，静态只能用静态.