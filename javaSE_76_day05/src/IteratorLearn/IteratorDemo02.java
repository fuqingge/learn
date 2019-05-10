package IteratorLearn;

import java.util.ArrayList;
import java.util.Collection;

public class IteratorDemo02 {
    public static void main(String[] args) {
        //for 增强

        Collection<String> collection = new ArrayList<String>();
        collection.add("1");
        collection.add("2");
        for (String s: collection){
            System.out.println(s);
        }


    }
}
