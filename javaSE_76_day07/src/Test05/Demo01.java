package Test05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
并使用keySet和entrySet两种方式遍历Map集合。
 */
public class Demo01 {
    public static void main(String[] args) {
        Map<Car, Integer> map = new HashMap<>();
        map.put(new Car(10000,"suv"),10000);

        //keySet遍历，获取键值的方法
        Set<Car> cars = map.keySet();
        for (Car car:cars
             ) {
            System.out.println(car + "-"+map.get(car));

        }

        //用entrySet获取键值对
        System.out.println("====================");
        Set<Map.Entry<Car, Integer>> set = map.entrySet();

        for (Map.Entry<Car,Integer> entry:set
             ) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
            



    }


}
