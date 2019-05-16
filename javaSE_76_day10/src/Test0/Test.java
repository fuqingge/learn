package Test0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
问题：
现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用Stream方式进行以
下若干操作步骤：
1. 第一个队伍只要名字为3个字的成员姓名；
2. 第一个队伍筛选之后只要前6个人；
3. 第二个队伍只要姓张的成员姓名；
4. 第二个队伍筛选之后不要前1个人；
5. 将两个队伍合并为一个队伍；
6. 根据姓名创建Student对象；
7. 打印整个队伍的Student对象信息。

两个队伍（集合）的代码如下：
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");
        List<String> list2 = new ArrayList<>();
        list2.add("宋远桥");
        list2.add("俞莲舟");
        list2.add("俞岱岩");
        list2.add("张松溪");
        list2.add("张翠山");
        list2.add("殷梨亭");
        list2.add("莫声谷");
        // 1. 第一个队伍只要名字为3个字的成员姓名；
        Stream<String> s1=list.stream().filter(s -> s.length()==3);
        //2. 第一个队伍筛选之后只要前6个人；
        Stream<String> s2=s1.limit(6);
        //3. 第二个队伍只要姓张的成员姓名；
        Stream<String> s3=list2.stream().filter(s -> s.startsWith("张"));
        //4. 第二个队伍筛选之后不要前1个人；
        Stream<String> s4 = s3.skip(1);
        //5. 将两个队伍合并为一个队伍；
        //6. 根据姓名创建Student对象；
        //7. 打印整个队伍的Student对象信息。
        Stream.concat(s2,s4).map((s)->new Student(s)).forEach((s)-> System.out.println(s));





    }
}

