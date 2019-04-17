package 练习;

/**
 * @program: Day02
 * @ClassName: Test7
 * @description:
 * @author: zhaoming
 * @create: 2019-04-14 21:36
 **/
/*

在main中创建数组int[] arr = {12,11,32,44,23,54};
Int  value  = 9；
将数组arr中的元素是2的倍数元素的值改为value
 */
public class Test7 {
    public static void main(String[] args) {
        int[] arr = {12,11,32,44,23,54};
        int value = 9;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (a % 2 == 0) {
                arr[i] = value;
            }
            System.out.println(arr[i]);
        }
    }
}
