package 方法练习;

public class Test9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int value = 5;
        fill(arr,value);
    }

    //定义一个方法fill(int[] arr,int value),功能:将数组arr中的所有元素的值改为value
    public static void fill(int[] arr,int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
            System.out.println(arr[i]);
        }
    }

}
