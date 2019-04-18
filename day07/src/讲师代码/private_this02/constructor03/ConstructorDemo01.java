package 讲师代码.private_this02.constructor03;
/*
    构造方法  : 用于创建对象 给对象初始化（给对象的成员变量赋值）的方法。
    默认的构造方法 : 给成员变量默认初始化。
    语法格式：
        public 类名() {

        }

 */
public class ConstructorDemo01 {

    public static void main(String[] args) {
        // 创建角色对象
        GameRole gr = new GameRole("爷!奴家给您跪了!", '男');
        gr.show();
    }
}
