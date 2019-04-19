package 习题;

import java.util.Scanner;

/*
字符串反转
	 举例：键盘录入”abc”
	 输出结果：”cba”
	 分析：
 		A:键盘录入一个字符串
 		B:写方法实现字符串的反转
 			a:把字符串倒着遍历，得到的每一个字符拼接成字符串。
 			b:把字符串转换为字符数组，然后对字符数组进行反转，最后在把字符数组转换为字符串
 		C:调用方法
 		D:输出结果
运行结果：
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String Str1 = "";
        for (int i = str.length()-1;i>=0;i--){
         Str1 = str.charAt(i)+Str1;
        }
        System.out.print("反转后："+Str1);
        System.out.println();

        char[] chars =Str1.toCharArray();
        System.out.println(chars);
        String str2 = "";
        for (int i = chars.length-1;i>=0;i--){
        char temp = chars[i];
        chars[i]  = chars[chars.length-1-i];
            chars[chars.length-1-i] = temp;

        }
        String str3 = new String(chars);
        System.out.println(str3);




    }


}
