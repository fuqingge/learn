package 练习;

import java.util.Random;

/**
 * @program: Day02
 * @ClassName: Test11
 * @description:
 * @author: zhaoming
 * @create: 2019-04-14 22:00
 **/
/*
定义一个长度为10的整数数组，使用随机数为数组赋值，要求为1-100之间的随机数
 */
public class Test11 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int a = random.nextInt(100) + 1;
            arr[i]  =a;
            System.out.print(arr[i]+",");
        }
    }
}
