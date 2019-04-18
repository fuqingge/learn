package 讲师代码.private_this02;
/*
    访问权限修饰符： 公开权限 最大 public 。  私有权限 最小 private。
    private 访问权限修饰符：可以用于修饰成员变量 和 成员方法(一般不修饰)。
    被private修饰的成员变量和成员方法只能在本类中使用。
        private 数据类型 变量名;
 */
public class Student {
    // 成员变量

    private String name; // 只能在本类中使用
    private int age; // 只能在本类中使用
    // 介绍自己的方法
    public void say() {
        System.out.println( name + "..." + age );
    }

    // 提供公开的set方法，给成员变量进行赋值
    public void setAge( int a ) {
        // 判断传递的年龄是否合法
        if( a >= 0 && a < 150 ) {
            // 在合法范围内允许赋值
            age = a;
        }
        // 如果不合法 统一默认为18岁
        age = 18;
    }

    // 提供公开的get方法，获取被私有的成员变量
    public int getAge() {
        return age;
    }
}
