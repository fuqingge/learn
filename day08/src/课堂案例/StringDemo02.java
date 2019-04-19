package 课堂案例;
/*
    获取功能的方法
    - public int length () ：返回此字符串的长度。
        举例:s.length() 获取s中的字符的数量

    - public String concat (String str) ：将指定的字符串连接到该字符串的末尾。
        举例:s1.conat(s2) 把s2连接到s1的末尾

    - public char charAt (int index) ：返回指定索引处的 char值。
        举例:s1.charAt(5) 获取s1中索引为5的字符

    - public int indexOf (String str) ：返回指定子字符串第一次出现在该字符串内的索引。
         举例:s1.indexOf(s2) 查找s2在s1中第一次出现的位置,如果不存在,返回-1

    - public String substring (int beginIndex) ：返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
        举例:s1.substring(5) 截取s1字符串从索引5开始一直到最后的内容

    - public String substring (int beginIndex, int endIndex) ：
        返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。
        举例:s1.substring(5,10) 截取s1字符串从索引5开始一直到索引10之间的内容(包含5,不包含10)
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "helloworld";
        String s2 = "add";
        System.out.println(s1.length());
        System.out.println(s1.concat(s2));
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf("h"));
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5,10));

    }
}
