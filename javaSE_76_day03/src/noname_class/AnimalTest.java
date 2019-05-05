package noname_class;
///抽象类作为形参和返回值
public class AnimalTest {
    public static void main(String[] args) {
        method(new Cat());
        Animal a =method2();
    }

    public static void method(Animal animal){
       animal.eat();
    }


    public static Animal  method2(){
        return new Cat();
    }
}
