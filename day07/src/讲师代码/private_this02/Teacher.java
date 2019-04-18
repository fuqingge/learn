package 讲师代码.private_this02;

public class Teacher {
    // 成员变量
    private String name;
    private int age;
    // 成员方法
    public void say() {
        System.out.println( name + ".." + age + ".." + this );
    }
    // 提供的get 和 set方法
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
