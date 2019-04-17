package 讲师代码;

public class Test1 {
    //数组遍历升级：要求将数组中的每个数据之间用逗号隔开。例如：1,2,3,4,5

    public static void main(String[] args) {
        int [ ] arr = {1,2,3,4,5};

        for (int i = 0;i<arr.length;i++){
            if (i==arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
}
