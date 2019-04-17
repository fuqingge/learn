package 练习;

import java.util.Random;

/**
 * @program: Day02
 * @ClassName: Test9
 * @description:
 * @author: zhaoming
 * @create: 2019-04-14 21:40
 **/
/*
现在main方法中有一个数组int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
要求如下：
1. 将数组中的0使用1-100之间的随机数替换掉，并统计替换了多少个。
2. 对操作后的数组进行遍历，查看替换后的结果
 */
public class Test9 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num = random.nextInt(100) + 1;
            //取出数组中每一个元素
            int a = arr[i];
            if (a == 0) {
                arr[i] = num;
                count++;
            }
        }
        System.out.println(count+"个");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");

        }
    }
}
