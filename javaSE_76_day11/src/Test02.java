import java.io.File;
import java.io.IOException;

public class Test02 {
    /*
    练习二:检查文件是否存在,文件的创建
描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
     */
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\a.txt");
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
