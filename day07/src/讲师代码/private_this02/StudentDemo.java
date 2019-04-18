package 讲师代码.private_this02;
/*
    1. 创建Student对象
    2. 给成员变量进行赋值
    3. 调用成员方法
 */
public class StudentDemo {
    public static void main(String[] args) {
        // 1. 创建Student对象  类名 对象名 = new 类名();
        Student s = new Student();
        // 2. 给成员变量进行赋值  对象名.成员变量 = 值;
        // s.name = "杨明";

        //s.age = -18;
        // 使用公开的方法 间接操作
        s.setAge( -18 );

        // 获取age变量 并输出打印到控制台
        System.out.println( s.getAge() );

        // 3. 调用成员方法
        s.say();
    }
}
