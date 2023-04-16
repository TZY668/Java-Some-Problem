package b05excent;

public class Test {
    public static void main(String[] args) {
        Zi z=new Zi();
        z.Show();
    }
}
//直接一个name就是局部位置开始想上找
//this.就是从本类成员位置开始向上找
//super.就是从父类成员位置开始向上找
//都有就近原则
//@Override重写注解,检查语言是否正确
//方法重写就是覆盖本身继承的上一个的虚方法表(必须是虚方法表)
//有许多要求，要记得