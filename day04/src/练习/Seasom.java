package 练习;

public class Seasom {
    /*
    能描述:给定月份，输出对应的季节要求:
  (1)定义一个月份，例如：int month = 5;
  (2)输出该月份对应的季节
   3,4,5春季
   6,7,8夏季
   9,10,11秋季
   12,1,2冬季
  (3)演示格式如下:
   定义的月份:5
   控制台输出:5月份是春季
     */
    public static void main(String[] args) {
        int month = 5;
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("请输入正确数字");

        }


    }
}
