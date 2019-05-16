import java.io.File;
import java.util.Scanner;

public class Test13 {
    /*
    描述:从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
     */
    public static void main(String[] args) {
        System.out.println("pllease input");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File dir = new File(path);
        long length = calculate(dir);
    }

    public static long calculate(File dir){
        long length = 0;
        // 获得文件数组
        File files[] = dir.listFiles();
        // 遍历数组
        for (File file :files) {
            // 判断是否是文件
            if(file.isFile()) {
                length += file.length();
            } else {
                length += calculate(file);
            }
        }
        return length;
    }



}
