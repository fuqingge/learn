package preview;

public class Mythread extends Thread {

    //指定线程的名称
    public Mythread(String name) {
        super(name);;
    }


    //重写run方法

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(getName()+i+"is running!");

        }
    }
}
