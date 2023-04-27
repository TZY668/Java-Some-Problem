package Demo4;

public class Interimpl implements Inter1,Inter2{
    @Override
    public void mathod1() {
        System.out.println("1");
    }

    @Override
    public void mathod2() {
        System.out.println("2");

    }

    @Override
    public void mathod3() {
        System.out.println("3");

    }

    @Override
    public void method4() {
        System.out.println("4");

    }
}
//同名重写一个就可以

