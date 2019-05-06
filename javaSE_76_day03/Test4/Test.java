package Test4;
/*
测试类：
- 创建Worker对象。
- 创建两个Apple对象，一个Apple（5，"青色"）,一个Apple（3，"红色"）
- 默认挑选大的苹果，打印苹果信息。
- 指定颜色挑选，通过匿名内部类实现。

 */
public class Test {
    public static void main(String[] args) {
        worker worker = new worker();

        Apple apple = new Apple(5, "青色");
        Apple apple1 = new Apple(3, "红色");

        Apple c = worker.pickApple(new Compare(), apple, apple1);
        System.out.println(c);

        System.out.println("挑红的:");
        Apple apple3 = worker.pickApple(new Compare() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                return "红色".equals(a1.getColor()) ? a1 : a2;
            }
        }, apple1, apple);
        System.out.println(apple3);



    }
}
