package 方法练习;
/*
3.1． 训练描述
有如下数组int[] arr={10,20};
定义一个方法求两个数字的和(方法参数为两个int类型),使用这个方法求出数组这两个元素相加的结果并打印
 */
public class Tset3 {
    public static void main(String[] args) {
        int[] arr={10,20};
        System.out.println(getSum(arr[0],arr[1]));

    }

    public static int getSum(int a ,int b){
            return a+b;
    }
}
