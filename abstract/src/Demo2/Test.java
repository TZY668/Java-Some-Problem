package Demo2;

public class Test {
    public static void main(String[] args) {
        Frog f=new Frog("^ 6 ^",23);
        System.out.println(f.getAge()+","+f.getName());
        f.eat();
        f.drink();
    }
}
