package preview;

import java.util.ArrayList;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length()==3)
                .forEach(s -> System.out.println(s));


    }
}
