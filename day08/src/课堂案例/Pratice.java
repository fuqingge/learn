package 课堂案例;

import java.util.Random;

/*
练习2：获取一个1-33之间（包含1和33）的随机数字
 */
public class Pratice {
    public static void main(String[] args) {
        Random random = new Random();
        int a =random.nextInt(33)+1;
        System.out.println(a);
    }

}
