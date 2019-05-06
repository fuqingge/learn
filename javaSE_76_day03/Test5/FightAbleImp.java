package Test5;
/*
定义战士类：

- 实现FightAble接口,重写方法中打印"武器攻击"。

 */
public class FightAbleImp implements FightAble {
    @Override
    public void specialFight() {
        System.out.println("武器攻击");
    }
}
