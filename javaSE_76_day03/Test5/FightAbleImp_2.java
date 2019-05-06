package Test5;
/*
定义法师类：
- 实现FightAble接口,重写方法中打印"法术攻击"。
 */
public class FightAbleImp_2 implements FightAble{
    @Override
    public void specialFight() {
        System.out.println("法术攻击");
    }
}
