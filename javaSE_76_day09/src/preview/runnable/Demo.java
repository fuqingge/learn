package preview.runnable;

public class Demo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        //将创建的对象作为Thread 构造方法中的target
        //public Thread (target,String name)
        //创建Thread对象,采用匿名和多态
        Thread thread = new Thread(myRunnable,"x");
        thread.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+"main");
        }

    }
}
