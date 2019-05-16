package preview;

public class Tset {

    public static void main(String[] args) {
        new Thread(()-> System.out.println("开启一个新线程")).start();
    }
}
