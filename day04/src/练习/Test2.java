package 练习;
/*
.打印1到100之内的整数，但数字中包含9的要跳过
要求：
每行输出5个满足条件的数，之间用空格分隔
如：1 2 3 4 5
 */
public class Test2 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        for (int i =1  ; i <=100 ; i++) {
            int ge = i%10;
            int shi = i/10%10;
            //包含9的数字
            if ((ge == 9) || (shi == 9)) {
                continue;
            }
            System.out.print(i+" ");
            count++;
            if (count%5==0){
                System.out.println();
            }
        }
    }
}
