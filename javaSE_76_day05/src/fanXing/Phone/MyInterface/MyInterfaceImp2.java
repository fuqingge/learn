package fanXing.Phone.MyInterface;

public class MyInterfaceImp2<T> implements MyInterface<T>{
    @Override
    public void method1(T t) {
        System.out.println(t);
    }

    @Override
    public T method2() {
        return null;
    }

    @Override
    public T method3(T t) {
        return null;
    }
}
