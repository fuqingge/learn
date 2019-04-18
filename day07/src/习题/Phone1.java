package 习题;

public class Phone1 {
    private String brand;
    private int price;

    public void call(){
        System.out.println("use"+price+brand+"'s phone calling");
    }

    public void sendMessage(){
        System.out.println("use"+price+brand+"'s phone sending");
    }

    public void playGame(){
        System.out.println("use"+price+brand+"'s phone playing");
    }

    //setter和getter方法
    public void setBrand(String brand){
        this.brand = brand;

    }
    public String getBrand(){
        return brand;
    }


    public void setPrice(int price){
        this.price = price;

    }
    public int getPrice(){
        return price;
    }

}
