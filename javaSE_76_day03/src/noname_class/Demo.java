package noname_class;

public class Demo {
    //匿名内部类，定义在一个方法里的内部类
    public static void main(String[] args) {
        //普通匿名类使用方法
        new Person(){
          public void show(){
              System.out.println("老师");
          }
        }.show();


//       匿名类的多态使用方法
// Person person = new Person(){
//            public void show(){
//                System.out.println("班主任write");
//            }
//        };
//        person.show();


    }
}
