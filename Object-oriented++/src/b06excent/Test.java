package b06excent;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        System.out.println(s1.name+","+s1.age);
    }
//想调动父类的有参构造，要手动的去写
}
