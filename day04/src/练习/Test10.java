package 练习;

import java.util.Scanner;

/**
 * @program: Day02
 * @ClassName: Test10
 * @description:
 * @author: zhaoming
 * @create: 2019-04-14 21:47
 **/
/*
分析以下需求，并用代码实现
	1.键盘录入san个int类型的数字，依次存入数组中
	2.要求：
		(1)求出三个数中的最小值并打印
		(2)求出三个数的和并打印
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入一个数字");
        int a = sc.nextInt();
        System.out.println("请输入二个数字");
        int b = sc.nextInt();
        System.out.println("请输入三个数字");
        int c = sc.nextInt();
        int arr[] = new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;*/
        int arr[] = new int[3];
        //最大索引是  arr.length -1    2
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第"+i+"个数字");
            int a = sc.nextInt();
            arr[i-1] =a;
            System.out.println(arr[i - 1]);
        }
        int min = arr[0];
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num < min) {
                min = num;
            }
            sum= sum +num;
        }
        System.out.println("最小值"+min);
        System.out.println("和值"+sum);
    }
}
