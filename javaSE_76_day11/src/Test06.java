import java.io.File;

public class Test06 {
    /*
    练习六:获取文件信息:文件名,文件大小,文件的绝对路径,文件的父路径
描述:
获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。

     */
    public static void main(String[] args) {

        File file = new File("d:/b.txt");
        String path = file.getAbsolutePath();
        String name  =file.getName();
        long size=file.length();
        //	// 获得父文件夹路径，返回文件对象
        File parten=file.getParentFile();
        //获得副文件夹路径
        String parent = file.getParent();
    }
}
