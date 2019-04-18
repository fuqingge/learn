
package 方法练习;

import java.util.Scanner;

/*
分析以下需求，并用代码实现
	1.提示用户输入10个整数，存入到int数组中；根据以下要求实现相关功能
	2.提示用户输入一个数字作为数组索引，查找数组中该索引对应的元素，
 */
public class Test15 {
    public static void main(String[] args) {

    }

    public static void getArr(int[]  arr){
        for (int i = 0; i <=10; i++) {
            System.out.print("请输入第"+i+"个数字");
            Scanner sca = new Scanner(System.in);
            int num = sca.nextInt();
            arr[i] = num;
            System.out.println(arr[i]);
        }
    }
    public static void getIndex() {
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();

    }


}
