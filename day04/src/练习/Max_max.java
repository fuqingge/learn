package 练习;

public class Max_max {
    /*5.
定义一个含有五个元素的数组,求数组中所有元素的最大值

    * */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};
        int max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i]> max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

}
