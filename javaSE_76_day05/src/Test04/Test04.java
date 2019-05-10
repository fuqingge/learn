package Test04;

import java.util.ArrayList;
import java.util.Collection;

import static Test04.Test04.listTest;

//五、定义一个方法listTest(ArrayList<String> al, String s),
// 要求使用contains()方法判断al集合里面是否包含s。
public class Test04 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("1");
        a1.add("2");
        a1.add("3");
        System.out.println(listTest(a1,"1"));
    }


    public static boolean listTest(ArrayList<String> al, String s){
        Collection<String> col = new ArrayList<>();
        for (String s1:al
             ) {if (col.contains(s)){

        }

        }return true;
    }

}
