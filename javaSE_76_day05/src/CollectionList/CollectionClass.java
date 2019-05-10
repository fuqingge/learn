package CollectionList;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionClass {
    public static void main(String[] args) {
        //使用多态的形式创建对象
       Collection<String> col = new ArrayList<String>();
       //添加元素
        col.add("sun");
        col.add("jing");

       // 移除
        col.remove("sun");

        //shi 否有静
        col.contains("jing");

        //转换成数组
        Object[] objects = col.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
}
