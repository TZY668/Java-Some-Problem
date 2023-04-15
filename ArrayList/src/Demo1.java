import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("健身了吗？");
        list.add("健身了吗？");
        list.add("健身了吗？");
        list.add("健身了吗？");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i== list.size()-1)
                System.out.print(list.get(i));
            else
                System.out.print(list.get(i));
        }
        System.out.println("]");
    }
}
