package Test4;
/*
- 属性：大小，颜色。
- 提供基本的构造方法和get方法，set方法

 */
public class Apple {
    private double size;
    private String color;

    public Apple(){
    }

    public Apple( double size,String color){
        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size+"-"+color;
    }
}
