package 方法练习;
//定义一个方法传入一个int类型数组，输出这个数组中每一个数字及其出现的个数
//		例如 传入数组[1,2,2,2,3,3,4,4,4,4]  打印结果：
//									数字1出现了1次
//								数字2出现了3次…
public class Test14 {
    public static void main(String[] args) {
int[] arr = {1,2,2,2,3,3,4,4,4,4};
        getTimes(arr);


    }
//记录出现的次数
    public static int getCount(int [] arr,int num){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                count++;
            }
        }return count;
    }

    public static void getTimes(int[] arr){

        for (int i = 0; i < arr.length; i++) {
          int count= getCount(arr,arr[i]);
            System.out.print(arr[i]);
            System.out.print("出现 "+count+"次");
            System.out.println();
        }

    }



}
