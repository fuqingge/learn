package Test09;

import java.util.ArrayList;
import java.util.Random;

//十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
public class Test09 {
    public static void main(String[] args) {
        int[] arr = new int[10] ;
        for (int i = 0; i <10 ; i++) {
            System.out.println("第"+(i+1)+"个数字：");
            Random random = new Random();
            int num =random.nextInt(100)+1;
            System.out.println(num);
            arr[i] = num ;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>=10){
                      int a = arr[i];
                      list.add(a);
            }
        }
        System.out.println(list);

    }
}
