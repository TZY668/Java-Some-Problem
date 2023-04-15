import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        //创建集合的对象
        ArrayList<String> list = new ArrayList<>();
//        System.out.println(list);
        //增删改查
        boolean result = list.add("aaa");
//        System.out.println(result);
//        System.out.println(list);
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
//        System.out.println(list);
//    boolean result2=list.remove("aaa");
//        System.out.println(result2);
//        System.out.println(list);
//        String str1=list.remove(1);
//        System.out.println(str1);
//        System.out.println(list);
        list.set(1, "eee");
        System.out.println(list);
        String str2 = list.get(0);
        System.out.println(str2);
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //
            String str=list.get(i);
            System.out.println(str);
        }
    }
}
