package 方法练习;

import java.util.Scanner;

/*
分析以下需求，并用代码实现
	1.键盘录入长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长
	2.键盘录入长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积
	3.键盘录入圆的半径
		定义方法计算该圆的周长,并在main方法中打印周长
	4.键盘录入圆的半径
		定义方法计算该圆的面积,并在main方法中打印面积

 */
public class Test7 {
    public static void main(String[] args) {
        int zhou =getZhouChang();
        System.out.println(zhou );//周长

        getArea();
        getCircleZhouChang();
        getCircleArea();





    }

    public  static int getZhouChang(  ){
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        return (a+b)*2;
    }

    public  static void getArea(){
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        int area = a*b;
        System.out.println(area);
    }

    public  static void getCircleZhouChang(){
        Scanner sca = new Scanner(System.in);
        int r = sca.nextInt();
        double circleZhouChang=2*3.14*r;
        System.out.println(circleZhouChang);
    }

    public  static void getCircleArea(){
        Scanner sca = new Scanner(System.in);
        int r = sca.nextInt();
        double circleArea=r*r*3.14;
        System.out.println(circleArea);

    }

}
