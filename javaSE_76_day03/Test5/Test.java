package Test5;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        String select  = "法力角色";
        System.out.println("选择:"+ select);
        FightAble f = player.FightAble_select(select);
        f.specialFight();
        f.commonFight();

        String slect2 = "武力角色" ;
        System.out.println("选择:"+slect2);
        FightAble f2 = player.FightAble_select(slect2);
        f2.commonFight();
        f2.specialFight();

    }
}
