package 方法练习;
/*
5.1． 训练描述
有定义一个方法,可以接受一个整数,
如果为[90,100] 这个范围方法返回’A’
如果为[80,90)这个范围方法返回’B’
如果为[70,80)这个范围方法返回’C’
如果为[60,70)这个范围方法返回’D’
如果为[0,60)这个范围方法返回’E’
整数不在以上范围的返回’F’

 */
public class Test5 {
    public static void main(String[] args) {
        getStep(80);
    }

    public static void getStep(int num){

        if (num>=90&&num<=100){
            System.out.println("A");
        }else if (num>=80&&num<90){
            System.out.println("B");
        }else if (num>=70&&num<80){
            System.out.println("C");
        }else if (num>=60&&num<70){
            System.out.println("D");
        }else if (num>=0&&num<60){
            System.out.println("E");
        }else{
            System.out.println("F");
        }
    }
}
