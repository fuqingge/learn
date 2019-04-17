package 基础练习;

import java.util.Random;

public class Test10 {

    /*
    编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分
    选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
     */
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random ran = new Random();
        int max = arr[0];
        int min = arr[arr.length-1];
        int sum =0;
        int sum2 = 0;
        int ave = 0;
        for (int i = 0;i<arr.length;i++){
            arr[i]=ran.nextInt(100)+1;
            if (arr[i]>max){
                max = arr[i];}
            if (arr[i]<min){
                min = arr[i];
            }
            sum = sum+arr[i];
            }
       sum2=min+max;
        ave =( sum-sum2)/(arr.length-2);
        System.out.println(ave);
        }

    }


