package 练习;

import java.util.Random;

public class Instead {
/*
9.
现在main方法中有一个数组int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
要求如下：
1. 将数组中的0使用1-100之间的随机数替换掉，并统计替换了多少个。
2. 对操作后的数组进行遍历，查看替换后的结果
•••••••••••••••••••••••••••••••••••

 */
    public static void main(String[] args) {
        int arr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        Random ran = new Random();
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            int a = arr[i];

         if (a == 0){
             arr[i]=ran.nextInt(100)+1;;
             count++;
         }

        }
        System.out.println(count+"ge");
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
