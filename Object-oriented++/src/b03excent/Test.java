package b03excent;

public class Test {
    public static void main(String[] args) {
        Zi z=new Zi();
        System.out.println(z);
        z.name="玉树临风先生";
        z.age=19;
        z.game="Apex";
        System.out.println(z.name+","+z.age+","+z.game);
    }
    //只要是成员变量，都会继承，但是私有的不能直接用
}
