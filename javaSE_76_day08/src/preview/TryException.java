package preview;

import java.io.FileNotFoundException;

public class TryException {
    public static void main(String[] args) {
        try{
            read("a.txt");
        }catch (FileNotFoundException e){
           e.printStackTrace();
        }finally {
            System.out.println("不管怎么样，结束程序" );
        }
        System.out.println("over");
    }


   public  static void read(String path) throws FileNotFoundException{
        if (!path.equals("a.txt")){
            throw new FileNotFoundException();
   }
    }
}
