import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        Student s1=new Student("张三",24);
        Student s2=new Student("李四",25);
        list.add(s1);
        list.add(s2);
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
