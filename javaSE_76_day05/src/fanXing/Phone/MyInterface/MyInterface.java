package fanXing.Phone.MyInterface;

public interface MyInterface <T> {
    //泛型作为参数
    void method1(T t);

    //泛型作为返回值
    T method2();

    //泛型作为参数和返回值
    T method3(T t);
}
