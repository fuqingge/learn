package fanXing.Phone;
/*
/*
    能不能在一个类型定义一个方法,接收的具体的是什么类型,就返回该具体类型???
    可以,使用泛型类.
    泛型类的格式:
        public class 类名<大写字母>

     泛型类:就是在类中定义了一个未知的类型.
     泛型类的类型何时确定:创建对象时才确定
 */
public class Factory<T> {
    public T fix (T o){
        System.out.println("fix");
        return  o;
    }

    public <E> E fixAll(E e){
        System.out.println("接了私活");
        return e;
    }



}
