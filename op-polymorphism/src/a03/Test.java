package a03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder();
//        sb.append()

//        ArrayList list=new ArrayList();
//        list.add();
        Animal a = new Dog();
        //编译看左边，运行看右边
//        a.eat();
//        Dog d = (Dog) a;
//        ((Dog) a).lookHome();
//        d.lookHome();
//        //转化时候不能瞎转化,否则会报错
//        if (a instanceof Dog) {
//
//        } else if (a instanceof Cat) {
//        }
        if(a instanceof Dog d){

        }
        //若结果是，则强行转换，转换之后变量名字为的
        //如果不是，则不转换，返回值为false
    }
}

//弊端：不能调用子类的特有功能
class Animal {
    public void eat() {
        System.out.println("动物吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗子吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫咪吃猫粮");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

