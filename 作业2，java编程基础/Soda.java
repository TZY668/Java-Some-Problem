public class Soda {
    public static void main(String[] args) {
        int total = 0; // 总共喝的汽水瓶数
        int bottle = 1000; // 初始有1000瓶汽水
        int emptyBottle = 0; // 初始没有空瓶子

        while (bottle > 0) {
            total += bottle; // 喝掉当前的瓶数
            emptyBottle += bottle; // 把瓶子加起来
            bottle = emptyBottle / 3; // 可以换的新瓶数
            emptyBottle = emptyBottle % 3; // 换完新瓶后剩余的空瓶数
        }

        System.out.println("总共能喝 " + total + " 瓶汽水，最后还剩余 " + emptyBottle + " 个空瓶子。");
    }
}
