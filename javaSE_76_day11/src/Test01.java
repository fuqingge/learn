import java.io.File;

public class Test01 {
/*
练习一:相对路径和绝对路径的使用
描述:创建两个文件对象，分别使用相对路径和绝对路径创建。

 */
    public static void main(String[] args) {
        File file = new File("d:\\a\\a.txt");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());

    }
}
