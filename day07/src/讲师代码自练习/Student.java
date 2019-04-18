package 讲师代码自练习;
/*
    访问权限修饰符： 公开权限 最大 public 。  私有权限 最小 private。
    private 访问权限修饰符：可以用于修饰成员变量 和 成员方法(一般不修饰)。
    被private修饰的成员变量和成员方法只能在本类中使用。
        private 数据类型 变量名;
 */
public class Student {
    //私有化
    private String name;
    private int age;

    //行为
    public void introduce(){
        System.out.println(age);
    }

    //用set方法给成员变量赋值
    public void setAge(int a){
        if (a>=0&&a<=100){
            //合法范围内赋值
            age = a;
        }else{
            System.out.println("wrong num" );
        }
    }
    public int getAge(){
       return age;
    }

}
