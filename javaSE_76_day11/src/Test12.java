import java.io.File;
import java.io.FileFilter;

public class Test12 {
    public static void main(String[] args) {
        //获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
        //答案
        File file = new File("d:/");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".java")){
                   return true;
                }else {
                    return false;
                }
            }
        });

        for (File f : files) {
            System.out.println(f.getAbsolutePath());


        }


    }
}
