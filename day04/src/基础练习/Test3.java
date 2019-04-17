package 基础练习;
//案例需求
//
//朋友聚会的时候可能会玩一个游戏：逢七过。
public class Test3 {
    public static void main(String[] args) {
        for (int i  = 1;i<=100;i ++){
            if (i%10==7||i/10%10==7||i/7==0){
                System.out.println(i);
            }

        }
    }
}
