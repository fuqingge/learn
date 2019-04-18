package 方法练习;
/*
析以下需求，并用代码实现(每个小需求都需要封装成方法)
	1.求两个数据之和(整数和小数)
	2.判断两个数据是否相等(整数和小数)
	3.获取两个数中较大的值(整数和小数)
	4.获取两个数中较小的值(整数和小数)
	5.否能用一个方法实现3和4的两个功能

 */
public class Test13 {
    public static void main(String[] args) {
        getNum(3,3.2);
        equal(1,2.2);
        getMax(2,2.6);
        getMin(1,2.2);
        getMaxMin(3,6.2);
    }

    //1.求两个数据之和(整数和小数)
    public static void getNum(int a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

    //2.判断两个数据是否相等(整数和小数)
    public static void equal(int a ,double b){
        if (a==b){
            System.out.println("equals");
        }else{
            System.out.println("no");
        }
    }

    //3.获取两个数中较大的值(整数和小数)
    public static void getMax(int a ,double b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    //4.获取两个数中较小的值(整数和小数)
    public static void getMin(int a ,double b) {
        if (a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    //5.否能用一个方法实现3和4的两个功能
    public static void getMaxMin(int a,double b){
        if (a>b){
            System.out.println("max"+a);
        }else{
            System.out.println("min"+b);
        }
    }





}
