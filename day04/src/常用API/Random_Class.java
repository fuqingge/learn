package 常用API;

import java.util.Random;
import java.util.Scanner;

public class Random_Class {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);//代表0-9
        System.out.println(num);


        /*
        - 需求：程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
- 效果：
  - 如果猜的数字比真实数字大，提示你猜的数据大了
  - 如果猜的数字比真实数字小，提示你猜的数据小了
  - 如果猜的数字与真实数字相等，提示恭喜你猜中了

         */

        Random random = new Random();
        int num1 = random.nextInt(100) + 1;
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            int num2 = scanner1.nextInt();
            if (num2 > num1) {
                System.out.println("big");
            } else if (num2 < num1) {
                System.out.println("small");
            } else {
                System.out.println("=");
                break;
            }

        }
    }
}