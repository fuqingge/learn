import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test02 {
    //十一、键盘录入一个字符串，
    // 去掉其中重复字符，打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
    public static void main(String[] args) {
        //录入
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //将字符串转换成字符数组
        char[] chars = s.toCharArray();
        //去重，排序
        LinkedHashSet<Character>  ch= new LinkedHashSet<>();
        for (char a:chars
             ) {
            ch.add(a);
        }

        for (char c:ch
             ) {
            System.out.println(c);
        }








    }
}
