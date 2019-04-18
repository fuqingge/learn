package 讲师代码自练习;
/*
    1. 创建Student对象
    2. 给成员变量进行赋值
    3. 调用成员方法
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        //用公开的方法赋值
        s.setAge(18);
        //用公开的方法获取age变量，打印
        System.out.println(s.getAge());

        //调用方法
        s.introduce();
    }


}
