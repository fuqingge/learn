package 讲师代码.private_this02;
/*
    1. 创建Teacher对象
    2. 调用set方法给变量赋值
    3. 调用say()方法运行查看变量的结果
 */
public class ThisDemo {
    public static void main(String[] args) {
        // 1. 创建Teacher对象
        Teacher t = new Teacher();
        System.out.println("t = " + t);
        // 2. 调用set方法给变量赋值
        t.setName("茅十八");
        t.setAge(18);
        // 3. 调用say()方法运行查看变量的结果
        t.say();
        System.out.println("==========");
        Teacher t1 = new Teacher();
        System.out.println("t1 = " + t1);

        // 2. 调用set方法给变量赋值
        t1.setName("茅十九");
        t1.setAge(19);
        // 3. 调用say()方法运行查看变量的结果
        t1.say();
    }
}
