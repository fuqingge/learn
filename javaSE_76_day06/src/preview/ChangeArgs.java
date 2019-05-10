package preview;

public class ChangeArgs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        getSum(arr);

        //求 2 3 4 三个元素和
        getSum(2,3,4);

    }

    //可变参数格式 修饰符返回值 方法名（变量类型...形参名）
    public static void getSum(int...arr){
        int sum = 0;
        for (int a :arr
             ) {
            sum=sum+a;

        }
        System.out.println("sum = " + sum);
    }

}
