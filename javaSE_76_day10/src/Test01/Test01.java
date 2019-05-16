package Test01;

public class Test01 {
    /*
    给定一个导演 Director接口，内含唯一的抽象方法makeMovie，且无参数、无返回值，使用lambda表达式在Test中完成调用。
     */
    public static void main(String[] args) {
     method(()-> System.out.println("dierctor"));
    }

    public static void method(Director1 director1){
        director1.makeMovie();
    }


}
