import java.io.File;

public class Test05 {
    /*
    练习五:删除文件和文件夹
描述:
将D盘下a.txt文件删除
将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。

     */
    public static void main(String[] args) {
        File file = new File("d:/a.txt");
        file.delete();

        File file1 = new File("D:/aaa");
        file1.delete();

    }
}
