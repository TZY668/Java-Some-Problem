 class Rectangle
{
    int length;
    int width;
    public int perimeter(){
        return 2*(length+width);
    }
    public int area(){
        return length*width;
    }
}
public class textRectangle{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.width=5;
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }

}
