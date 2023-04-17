package a01;

public class Test {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法

        Student s = new Student();
        s.setName("张三");
        s.setAge(18);


        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(30);

        Administrator admin = new Administrator();
        admin.setName("王五");
        admin.setAge(35);


        register(s);
        register(t);
        register(admin);


    }


    //这个方法既能接收老师，又能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}

//多态的前提
//有继承或者实现关系
//父类引用指向子类对象
//有方法的重写
//好处：可以接受=收所有子类对象，更便利
//在多态形式下，右边对象可以实现解耦合，便于扩展和维护
//使用父类类型作为参数，可以接收所有子类对象
