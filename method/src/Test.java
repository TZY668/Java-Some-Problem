public class Test {
    public static void main(String[] args) {

        int arr[]={11,22,33,44,55};
         System.out.print(contains(arr,19));
    }
    public static void printArr(int[] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            System.out.print(arr[i]);
            else
                System.out.print(arr[i]+", ");
        }
        System.out.print("}");
    }
    //遍历
    public static int getMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    //最大值
    public static boolean contains(int arr[],int num){
       for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
                return true;
        }
       return false;
    }
}

