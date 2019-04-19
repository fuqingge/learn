package 课堂案例;

public class Constrocter {
/*
- public String() ：初始化新创建的 String对象，以使其表示空字符序列。
- public String(char[] value) ：通过当前参数中的字符数组来构造新的String。
- public String(byte[] bytes) ：通过使用平台的默认字符集解码当前参数中的字节数组来构造新的String。
- 直接赋值的方式创建字符串对象

 */

    public static void main(String[] args) {
        String st = new String();
        System.out.println("st"+st);

        char[] value = {'a','b'};
        String s1 = new String(value);
        System.out.println(s1);

        byte[] bs = {97, 98, 99};
        String s3 = new String(bs);
        System.out.println(s3);

    }




}
