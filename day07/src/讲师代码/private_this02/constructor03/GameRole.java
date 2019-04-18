package 讲师代码.private_this02.constructor03;
/*
    游戏角色的类:
        属性 : 角色名   性别
        方法 : show() 显示角色的信息
    默认构造方法（隐式）：当类创建完成之后，在类中就已经存在了一个隐式的空参构造方法。
 */
public class GameRole {
    // 成员变量
    private String name;
    private char sex;

    // 成员方法
    public void show() {
        System.out.println(name + ".." + sex );
    }
    // 有参的构造方法 创建对象时给对象指定数据初始化
    public GameRole( String name , char sex ) {
        this.name = name;
        this.sex = sex;
    }

    // 无参默认构造方法
    public GameRole() {}

}
