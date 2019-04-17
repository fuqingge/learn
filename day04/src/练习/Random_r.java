package 练习;

import java.util.Random;

public class Random_r {
    /*
    11.
    定义一个长度为10的整数数组，使用随机数为数组赋值，要求为1-100之间的随机数
     */
    public static void main(String[] args) {
        int[] arr= new int[10];
        Random ran = new Random();

        for (int i = 1;i<arr.length;i++){
            int num = ran.nextInt(100)+1;
            arr[i] =num;
            System.out.println(arr[i]);
        }

            }

}
