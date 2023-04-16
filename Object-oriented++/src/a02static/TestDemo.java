package a02static;

public class TestDemo {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,};
        String str=ArrayUtil.printArr(arr);
        System.out.println(str);
        double []arr1={1.2,1.3,4.5,4.6,4.4};
        double avg =ArrayUtil.getAverage(arr1);
        System.out.println(avg);
    }
}
