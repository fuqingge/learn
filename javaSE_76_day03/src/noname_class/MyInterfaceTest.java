package noname_class;

public class MyInterfaceTest {
    public static void main(String[] args) {
        MyInterface a = getInstance();
        method(new MyInterfaceImp());

    }
    public static MyInterface  getInstance(){
        return new MyInterfaceImp();
    }

    public static void method(MyInterface myInterface){
        myInterface.getId();
    }



}
