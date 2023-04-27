package Demo3;

public class Test {
    public static void main(String[] args) {
    Frog f=new Frog("小青",900);
        System.out.println(f.getAge()+","+f.getName());
        f.eat();
        f.swim();
        Rabbit r=new Rabbit();
        System.out.println(r.getAge()+","+r.getName());
    r.eat();

    }
}
//类，是一类物
//接口是一种规则
//interface来定义
//只能是常量，默认修饰符 public static final
//构造方法：无
//接口和类的实现关系可以单实现，也可以多实现,也就是他们是实现关系
//public class xxx implements接口名1，接口名字2
//实现类还可以在继承一个类的同时实现多个缺口
//接口和接口之间是继承关系,单多都可以
//如果类实现是最下面的接口，则需要重写所有方法
