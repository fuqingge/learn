import java.io.File;

public class Test09 {
    public static void main(String[] args) {
        /*
        键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
如果是文件，则输出文件的大小
如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
         */
        File file = new File("d:a");
        if (file.isFile()){
            System.out.println(file.length());
        }else{
            File[] files = file.listFiles();
            long length = 0;
            for (File f:files){
                length=f.length()+length;

            }
        }



    }
}
