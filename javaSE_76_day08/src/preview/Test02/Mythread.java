package preview.Test02;

public class Mythread extends Thread{
    //定义线程的名字
    public Mythread(String name) {
        super(name);
    }

    //重写run方法

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i+"正在执行"+getName());
        }
    }
}
