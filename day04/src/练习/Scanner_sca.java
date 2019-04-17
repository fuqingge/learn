package 练习;
import java.util.Scanner;
/*
10.
分析以下需求，并用代码实现
	1.键盘录入三个int类型的数字，依次存入数组中
	2.要求：
		(1)求出三个数中的最小值并打印
		(2)求出三个数的和并打印
 */

public class Scanner_sca {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "个数字");
            int a = scanner.nextInt();
            arr[i - 1] = a;
            System.out.println(arr[i - 1]);
        }
         int min = arr[0];
         int sum = 0;
        for (int i =1 ;i<arr.length;i++) {
            int num = arr[i];
            if (num<min){
                min = num;
            }
           sum=sum+num;
        }
        System.out.println("min"+min);
        System.out.println(sum);


    }
}

