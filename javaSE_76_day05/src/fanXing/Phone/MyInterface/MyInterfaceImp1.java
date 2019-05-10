package fanXing.Phone.MyInterface;
////1.在定义实现子类中直接确定接口的类型
public class MyInterfaceImp1 implements MyInterface<String>{
    @Override
    public void method1(String s) {
        System.out.println(s);
    }

    @Override
    public String method2() {
        return "o";
    }

    @Override
    public String method3(String s) {
        return "o";
    }
}
