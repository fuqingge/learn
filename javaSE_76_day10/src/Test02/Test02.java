package Test02;
/*
给定一个计算器 Calculator 接口，内含抽象方法 calc (减法)，
其功能是可以将两个数字进行相减，并返回差值。使用Lambda表达式在Test中完成调用。
 */
public class Test02 {
    public static void main(String[] args) {
           method((int a,int b)->{return  a-b;},100,500);
    }

    public static void method(Calculator calculator, int a, int b){
        int result= calculator.calc(a,b);
        System.out.println(result);

    }

}
