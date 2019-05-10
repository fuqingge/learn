package IteratorLearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo01 {
    public static void main(String[] args) {
         Collection<String> collection = new ArrayList<String>();
        collection.add("1");
        collection.add("2");

         //获取每个对象的迭代器
        Iterator<String> it = collection.iterator();
        //迭代器常用方法
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
