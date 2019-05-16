import java.io.File;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        /*
        练习三:单级文件夹的创建
描述:在D盘下创建一个名为bbb的文件夹。

         */

        File file = new File("D:/bbb");
        file.mkdir();


    }
}
