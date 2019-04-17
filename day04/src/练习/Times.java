package 练习;

public class Times
{

    /*
    计算出数组中指定元素出现的次数。
数组: int[] arr = {1,43,43,5,4,6,6,7,7,88,9,9,9,0,0,9};
指定元素: int x = 9;

     */

    public static void main(String[] args) {
        int[] arr = {1,43,43,5,4,6,6,7,7,88,9,9,9,0,0,9};
        int x = 9;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
