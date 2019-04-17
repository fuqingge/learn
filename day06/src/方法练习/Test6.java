package 方法练习;
/*
主方法中给定数组int[] arr= {10,20,30,40,50,60};
这个数组没有重复元素.定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值
 */

public class Test6 {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        getIndex(arr);
    }

    public static  void getIndex(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr [i];
            }
        }System.out.println("max="+max);
        for (int i = 0; i < arr.length; i++) {
            if (max==arr[i]){
                System.out.println(i);
            }
        }

    }
}
