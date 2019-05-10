package fanXing.Phone.MyInterface;

public class Demo {
    public static void main(String[] args) {
        MyInterfaceImp1 myInterfaceImp1 = new MyInterfaceImp1();
        myInterfaceImp1.method1("s");


        //实现2
        MyInterfaceImp2<String> imp2 = new MyInterfaceImp2<>();
        imp2.method1("sun");
    }
}
