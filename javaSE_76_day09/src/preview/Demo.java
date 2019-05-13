package preview;

public class Demo {
    public static void main(String[] args) {
        Mythread mythread = new Mythread("new!");
        mythread.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main"+i);
        }

    }
}
