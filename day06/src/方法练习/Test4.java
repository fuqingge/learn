package 方法练习;
/*
主方法中给定数组int[] arr= {10,20,30,40,50,60};定义一个方法可以接受这个给定的数组
并返回这个数组中元素的最小值

 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        getMin(arr);
    }

    public  static void getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
