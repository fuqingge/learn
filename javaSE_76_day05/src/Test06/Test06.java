package Test06;

import java.util.ArrayList;

//八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
// 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
public class Test06 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(listTest(list,1));;
    }

    public static int listTest(ArrayList<Integer> al, Integer s){

        for (int i = 0; i <al.size() ; i++) {
            if (s.equals(al.get(i))){
                return i;
            }

        }return -1;

    }
}

