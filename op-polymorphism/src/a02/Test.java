package a02;

public class Test {
    public static void main(String[] args) {
        Animal a1=new Dog();
        System.out.println(a1.name);
//        Dog d1=new Dog();
//        System.out.println(d1.name);
//        Cat c1=new Cat();
        a1.show();
    }
}
class Animal{
    String name="动物";
    public void show(){
        System.out.println("Animal---show方法");
    }

}
class Dog extends Animal{
    String name="狗";
    @Override
    public void show(){
        System.out.println("Dog---show方法");
    }
        }
class Cat extends Animal{
    String name="猫";
    @Override
    public void show(){
        System.out.println("Cat---show方法");
    }
}
//调用成员变量，编译看左边，运行也看左边
//方法看右边
//就是定义的左边和右边

