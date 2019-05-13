package preview.Test03;

public class Tset {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        ChiHuo chiHuo = new ChiHuo("吃货",bz);
        BaoZiPu baoZiPu = new BaoZiPu("包子铺",bz);
        chiHuo.start();
        baoZiPu.start();
    }
}
