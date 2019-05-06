package Test5;
/*
定义接口FightAble：
- 抽象方法：specialFight。
- 默认方法：commonFight,方法中打印"普通打击"。

 */
public interface FightAble {
    public abstract void specialFight();

    public default void commonFight(){
        System.out.println("普通打击");
    }
}
