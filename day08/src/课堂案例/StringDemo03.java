package 课堂案例;
/*
    转换功能的方法

    - public char[] toCharArray () ：把字符串变成对应的字符数组。
        举例:s1.toCharArray() 把s1变成字符数组

    - public byte[] getBytes () ：把字符串变成对应的字节数组。
        举例:s1.getBytes() 把s1变成字节数组

    - public String replace (String oldStr, String newStr) ：把字符串中的所有的oldStr替换成newStr。
        举例:s1.replace("a","A") 把s1中的所有的"a"替换成"A"

 */
public class StringDemo03 {
    public static void main(String[] args) {
        String s1 = "abcde";
        char[] chars =s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println(s1.replace("a","b"));
    }
}
