package 方法练习;

import java.util.Random;
import java.util.Scanner;

/*
随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值
*/
public class Test2 {
    public static void main(String[] args) {
        getSum();
    }

    public static void getSum(){
        Random ran = new Random();
        int a ;
        int b ;
        a = ran.nextInt(101);
        b = ran.nextInt(101);
        int sum = a+b;
        System.out.println(sum);

    }
}
