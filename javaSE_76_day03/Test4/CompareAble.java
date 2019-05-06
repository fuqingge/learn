package Test4;
//定义默认方法compare，挑选较大苹果。
public interface CompareAble {
    public default Apple compare(Apple a1,Apple a2){
        return a1.getSize() > a2.getSize() ? a1 : a2;
    }
}
