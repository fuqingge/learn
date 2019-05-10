package Test05;

import java.util.ArrayList;
import java.util.Collection;

//六、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        listTest(list);
    }

    public static void listTest(ArrayList<String> al){

        if (al.isEmpty()){
            System.out.println(true);
        }else {
            System.out.println("false");
        }
    }
}
