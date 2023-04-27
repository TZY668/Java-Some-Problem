package Demo1;

public abstract class Person {
    public abstract void work();
   /* public void sleep(){
        System.out.println("睡觉");
    }*/
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
//抽象类和抽象方法
//抽象类不能实例化，也就是不能创建对象
//抽象类中不一定有创建方法
//有抽象方法的类一定是抽象类
