package 讲师代码;

public class Test2 {
//数组获取最大值元素
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = arr[0];
        for (int i = 1;i<arr.length;i++) {
        if (max<arr[i]){
            max=arr[i];
        }

        }
        System.out.println(max);

    }
}
