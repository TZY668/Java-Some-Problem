package Demo2;

public class Frog extends Animal{

    public Frog() {
    }

    public Frog(String name,int age) {
        super(name, age);
    }//Constructor
    @Override
    public void eat() {
        System.out.println("青蛙在食虫子");
    }


}
