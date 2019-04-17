package 练习;

/**
 * @program: Day02
 * @ClassName: Test6
 * @description:
 * @author: zhaoming
 * @create: 2019-04-14 21:28
 **/
/*
已知数组int[] nums = {5,10,15},,要求创建一个新数组
要求：
1.新数组的长度和已知数组相同
2.新数组每个元素的值 是已知数组对应位置元素的2倍
3.在控制台中打印新数组的所有元素
 */
public class Test6 {
    public static void main(String[] args) {
        int[] nums = {5,10,15};
        int[] arr= new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            //原来数组的元素值
            int a = nums[i];
            arr[i] = a * 2;
            System.out.println(arr[i]);
        }
    }
}
