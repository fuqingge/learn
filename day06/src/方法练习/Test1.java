package 方法练习;
/*
定义一个方法 能接受一个整数(这个整数大于3)打印0到这个整数(包含)之间的所有的偶数
如 接受的数字是6则调用完方法打印出来的偶数是 0 2 4 6
如 接受的数字是 5则调用完方法打印出来的偶数是 0 2 4

 */
public class Test1 {

    public static void main(String[] args) {
        getOu(15);
    }

    public static  void getOu(int num){
        System.out.print("0"+" "+"2"+" ");
      while (num>3){

          if (num%2==0){
              System.out.print(num+" ");
          } num--;
    }
    }
}
