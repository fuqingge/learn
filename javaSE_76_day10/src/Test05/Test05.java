package Test05;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，使用Stream将二者合并到List集合
 */
public class Test05 {
    public static void main(String[] args) {
       Stream<String> streamA = Stream.of("郭靖","杨康");
       Stream<String> streamB = Stream.of("黄蓉","穆念慈");
       Stream<String> streamC = Stream.concat(streamA,streamB);
    }
}
