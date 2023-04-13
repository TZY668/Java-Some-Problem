public class StringTest6 {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        String str1=arrToString(arr);
        System.out.println(str1);
    }

    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        //证明数组没问题
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result =result+ arr[i];
            if(i!=arr.length-1)
            {
                result+=",";
            }
        }
        result=result+"]";
    return result;
    }
}
