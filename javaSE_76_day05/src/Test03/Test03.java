package Test03;

import java.util.ArrayList;
import java.util.Collection;

//四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。
// （可以使用Object[]数组类型接收转换的数组）
public class Test03 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        System.out.println(collection);
        Object[] array = collection.toArray();
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

    }
    
    
    
}
