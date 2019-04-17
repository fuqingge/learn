package 额外练习;

import java.util.Scanner;

public class Test1 {
    /*
    1计算1到100之间的质数有多少？这些数字之和
    2 最高山峰是珠穆朗玛峰8848，有张纸，厚度0.01米，折叠多少次可以折成8848

     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int a = 2;
            while (i > 2) {
                if (i % a == 0) {
                    break;
                }
                a++;
            }
            if (i == a) {
                System.out.println(a);
            }
        }

        //di2题
        double b = 0.01;
        int count = 0;
        while (true) {
            if (b < 8848) {
                count++;
                b = b * 2.0;
                System.out.println(count);
            } else {
                break;
            }
        }
        System.out.println(count);


        /*
         3键盘录入x的值，计算出y
    x>=3; y = 2*x+1
    -1<x<3     y=2*x
    x<=-1 y=2*x-17

    4键盘录入三个整数，并将三个数中最大值打印
         */
        Scanner sca = new Scanner(System.in);

    }
    }


