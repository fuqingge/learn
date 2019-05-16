package Test03;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.stream.Stream;

public class Test03 {
    /*
    有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素存入新数组
     */
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏");

        Stream<String> stream1 = stream.filter(s -> s.startsWith("张"));
        String[] s =stream1.toArray(str ->new String[str]  );


    }

}
