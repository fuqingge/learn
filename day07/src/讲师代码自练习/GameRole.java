package 讲师代码自练习;

public class GameRole {
    /*
    游戏角色的类:
        属性 : 角色名   性别
        方法 : show() 显示角色的信息
    默认构造方法（隐式）：当类创建完成之后，在类中就已经存在了一个隐式的空参构造方法。
 */
   //属性
    private String name ;
    private char sex;
    //行为
    public void show() {
        System.out.println(name + sex);
    }

    //无参数默认构造方法
    public GameRole(){

    }
    //// 有参的构造方法 创建对象时给对象指定数据初始化
    public GameRole(String name,char sex){
    this.name = name;
    this.sex=sex;
    }


}
