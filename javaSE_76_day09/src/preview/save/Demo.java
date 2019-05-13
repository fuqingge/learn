package preview.save;

public class Demo {
    public static void main(String[] args) {
        //创建线程任务对象
        TicketRunnable ticket = new TicketRunnable();
        //创建三个窗口对象
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        //同时卖票
        t1.start();
        t2.start();
        t3.start();

    }

}
