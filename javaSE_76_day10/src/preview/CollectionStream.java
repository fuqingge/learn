package preview;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionStream {
    public static void main(String[] args) {
        //根据Collection获取流获取stream方式
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //根据数组获取流
        String[] arr ={"张无极","张三丰","周芷若"};
        Stream<String> stream1 = Stream.of(arr);

        //forEach
        stream.forEach(((String s) -> System.out.println(s) ));

        //统计姓张的，然后将姓名存到另一个Stream里
        Stream<String> stream2=stream1.filter(s -> s.startsWith("张"));

        //统计新Stream里的元素个数
        System.out.println(stream2.count());

    }
}
