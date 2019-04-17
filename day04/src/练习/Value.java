package 练习;

public class Value {
    /*
    在main中创建数组int[] arr = {12,11,32,44,23,54};
    Int  value  = 9；
    将数组arr中的元素是2的倍数元素的值改为value

     */
    public static void main(String[] args) {
        int[] arr = {12, 11, 32, 44, 23, 54};
        int value = 9;

        //先遍历所有数字
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            //找出2的倍数
            if (a % 2 == 0) {
                a = value;
            }
            System.out.println(a);
        }
    }
}


    /*
    8.
打印1~100之间 6的倍数的个数。

     */

