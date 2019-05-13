package preview.Test03;

public class BaoZiPu extends  Thread{
    private Baozi bz;

    public BaoZiPu(String name, Baozi bz) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz){
               if (bz.flag==true){
                   try {
                       bz.wait();
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }
               }
                System.out.println("包子铺正在作包子");
                if (count % 2 == 0) {
                    bz.xian="肉";
                    bz.pi= "冰皮";
                }else {
                    bz.pi = "薄皮";
                    bz.xian = "牛肉大葱";
                }
                count++;

                bz.flag=true;
                System.out.println(bz.pi+bz.xian+"包子做好了");
                System.out.println("吃货来吃吧");
                bz.notify();

            }
        }
    }
}
