package b01excent;

public class Test {
    public static void main(String[] args) {
        Ragdoll rg=new Ragdoll();
        rg.eat();
        Husky h=new Husky();
        h.breakHome();
        //private则子类无法访问;
    }
}
