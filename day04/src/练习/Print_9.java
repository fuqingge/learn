package 练习;

public class Print_9 {
    /*
    2.打印1到100之内的整数，但数字中包含9的要跳过
要求：
每行输出5个满足条件的数，之间用空格分隔
如：1 2 3 4 5
     */
   public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
           //十位
            int a = i/10%10;
            //个位
            int b=i%10;
            if ((a ==9)||(b==9)) {

                continue;
                }
                System.out.print(i+"  ");
                count++;

                if (count%5==0){
                    System.out.println();

            }

        }











   }




        }



