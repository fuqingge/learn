package Test01;

import java.util.ArrayList;
import java.util.HashMap;

/*
练习八：Map集合的使用（三）
八、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaccs");
        list.add("dfhkkk");

        HashMap<Character,Integer> map = new HashMap<>();

        for (String str:list
             ) {
            char[] chars = str.toCharArray();
            Integer count = 0;

            for (char c:chars
                    ) {
                if (map.containsKey(c)){
                    count = map.get(c);
                    map.put(c,count+1);
                }else{
                    map.put(c,1);
                }

            }


        } System.out.println(map);







    }
}
