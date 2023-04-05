public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰",100,'男');
        //角色
        Role r2 = new Role("鸠摩智", 100,'男');
        //第二个角色

    r1.shouRoleinfo();
    r2.shouRoleinfo();
       while (true) {
            r1.attack(r2);
            //判断r2的剩余血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }
        }
    }
}
//文字格斗游戏

