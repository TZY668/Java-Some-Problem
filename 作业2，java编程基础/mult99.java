public class mult99{
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { // 外层循环控制行数
            for (int j = 1; j <= i; j++) { // 内层循环控制列数
                int result = i * j;
                System.out.print(j + "*" + i + "=" + result + "\t"); // 打印每个乘法结果并用制表符分隔
            }
            System.out.println(); // 打印完每一行后进行换行
        }
    }
}
