package 额外练习;

import java.util.Random;

public class Test2 {
    //随机生成10个1-100（包含1，100）之间的数字，
    //把生成的随机数存放到数组中1，计算数组中元素的最大值，平均值，并打印出结果
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 1;i<=10;i++){
            int num = ran.nextInt(100)+1;
            arr[i-1]=num;
            System.out.print("数组中的值"+arr[i-1]+" ");
        }
        int max = arr[0];
        for (int i = 1 ;i<arr.length;i++){

            if (max<arr[i]){
                max=arr[i];
            }
            sum = sum+arr[i];
        }
        System.out.println("sum="+sum);
        System.out.println("最大值"+max);
        int  ave = sum/arr.length;
        System.out.println(ave);



    }
}
