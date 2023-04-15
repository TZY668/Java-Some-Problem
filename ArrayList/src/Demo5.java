import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        user u1 = new user("2205001", "蜀汉", "123456");
        user u2 = new user("2205002", "江东", "258456");
        user u3 = new user("2205003", "魏朝", "852465");
        ArrayList<user> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        int b1=contains(list,"2205003");
        System.out.println(b1);

    }

    public static int contains(ArrayList<user> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
