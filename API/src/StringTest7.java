//反转
public class StringTest7 {
    public static void main(String[] args) {
        String str=reverser("abc");
        System.out.println(str);
    }
    public static String reverser(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {

          char c=str.charAt(i);

            result=result+c;
        }
        return result;
    }
}
