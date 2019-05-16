package Test07;
/*1.	定义一个函数式接口IntCalc,其中抽象方法int calc(int a , int b)，使用注解@FunctionalInterface
2.	在测试类中定义static void getProduct(int a , int b ,IntCalc calc), 该方法的预期行为是使用calc得到a和b的乘积并打印结果
        3.	测试getProduct(),通过lambda表达式完成需求*/


public class Test {
    public static void main(String[] args) {
       getProduce(100,200,((a, b) -> a*b) );
    }

    public static void getProduce(int a ,int b,IntCalc calc){
        calc.calc( a,b);

    }
}
