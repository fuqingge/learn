package preview.save;
//问题IDE ticket输出的是数字  怎么弄的
public class TicketRunnable implements Runnable{
    private int ticket = 100;
    Object lock = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.getStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖:" + ticket--);
                }
            }

        }
    }


    /*
     @Override
    public void run() {
        while (true) {
           sellTicket();
        }
         public synchronized void  sellTicket {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.getStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖:" + ticket--);
                }
            }
         }
        }
    }
     */
}
