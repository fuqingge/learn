package 额外练习;

import java.util.Random;

/*
随机生成10个1-100（包含1，100）之间的数字，把生成的随机数存放到数组中，
计算数组中元素的最大值，平均值，并打印出结果
 */
public class CeShi {
    public static void main(String[] args) {
        //创建随机数
        Random random = new Random();
        //创建一个长度是10的数组
        int[] arr = new int[10];
        //for遍历10次,作用：给数组赋值的
        for (int i = 0; i < 10; i++) {
            //获取随机数
            int num = random.nextInt(100) + 1;
            //生成的随机数存放到数组中
            arr[i] = num;
            System.out.print(arr[i] + " ");
        }
        //假设第一个最大
        int max = arr[0];
        //定义变量保存和值
        int sum = 0;
        //定义变量保存平均值
        int avg = 0;
        //for循环作用：求最大值
        for (int i = 0; i < arr.length; i++) {
            //数组取值格式：数组名[索引]
            int a = arr[i];
            if (a > max) {
                max = a;
            }
            //和值    sum += a    --->   sum = sum +  a
            sum += a;
        }
        //求平均值
        avg = sum / arr.length;
        System.out.println("最大值：" + max);
        System.out.println("平均值：" + avg);
    }
}
