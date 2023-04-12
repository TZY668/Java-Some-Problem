public class StringTest {
    public static void main(String[] args) {
        String name="彭于晏";
        String schoolname="北京大学";
        System.out.println(name+schoolname);
        String s1="abc";
        String s2=new String();
        System.out.println("@"+s2+"!");
        String s3=new String("abc");
        System.out.println(s3);
        //s3无意义
        char[]chs={'a','b','c','d'};
        String s4=new String(chs);
        System.out.println(s4);
        //s4可以通过改变数组间接改变字符串，但是字符串不能直接改变;
        byte [] bytes={97,98,99,100};
        String s5=new String(bytes);
        System.out.println(s5);
        //转换为阿斯卡玛
        //直接赋值和new出来的内存占用并不一样
        //直接赋值是如果以前有则用以前的，以前没有则创建新的
        //new则是全部重新创建
    }
}
