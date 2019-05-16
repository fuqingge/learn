import java.io.File;

public class Test08 {
    /*
    描述:
获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
注意：不包含子文件夹下的文件

     */
    public static void main(String[] args) {
        File d = new File("d:/bbb");
        File[] files = d.listFiles();
        for (File file:files){
            System.out.println(file.getName());
        }

    }

}
