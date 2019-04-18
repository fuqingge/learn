package 讲师代码自练习;
/*
2. 定义测试类
   1. 创建Phone对象
   2. 通过对象给属性赋值
   3. 通过对象调用方法
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.color = "yellow";
        p.price = 2000;
        p.name = "iphone";

        p.call();
        p.message();
    }


}
