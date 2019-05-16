import java.io.File;

public class Test07 {
    /*
    1.判断File对象是否文件,是文件则输出：xxx是一个文件，否则输出：xxx是不是一个文件。
2.判断File对象是否文件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx是不是一个文件夹。(xxx是文件名或文件夹名)
     */
    public static void main(String[] args) {
        File file = new File("d:/a");
        if (file.isFile()){
            System.out.println(file.getName()+"是一个文件");
        }else{
            System.out.println("no");
        }

        if (file.isDirectory()){
            System.out.println(file.getName()+"是文件夹");
        }else{
            System.out.println("no");
        }

    }
}
