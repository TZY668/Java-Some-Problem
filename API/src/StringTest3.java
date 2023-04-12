public class StringTest3 {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("ABC");
        System.out.println(s1==s2);
        boolean result1=s1.equals(s2);
        System.out.println(result1);
        boolean result2=s1.equalsIgnoreCase(s2);
        System.out.println(result2);
        //Test2注释的测试
        //忽略大小写只能是英文，中文繁体那些需要去github上面找模块
    }
}
