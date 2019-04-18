package 讲师代码自练习;
/*
需求： 使用class描述手机这类事物，要求事物具备属性和行为 ， 创建对象调用属性和行为。

1. 定义Phone 手机类
   1. 定义成员变量   name  price color
   2. 定义成员方法  call();  message();
 */
public class Phone {
    String name;
    int price;
    String color;

    public void  call(){
        System.out.println(name+"call me baby"+price);
    }

    public void  message(){
        System.out.println(color+"send me a message");
    }


}
