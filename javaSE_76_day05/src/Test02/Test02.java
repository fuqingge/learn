package Test02;

import java.util.ArrayList;

//三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
public class Test02{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
       ArrayList<Integer> list = getArrayList(arr);
        System.out.println(list);
    }


   public static ArrayList<Integer> getArrayList(int[] arr){
       ArrayList<Integer> list = new ArrayList<>();
       for (int a :arr
            ) {
           System.out.println(a);
           list.add(a);
       }return list;
   }
}
