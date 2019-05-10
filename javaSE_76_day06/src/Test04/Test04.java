package Test04;

import java.util.ArrayList;

public class Test04 {
    /*
    练习十三：Comparable和Comparator两个接口的使用
十三、分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，如果成绩一样，
那在成绩排序的基础上按照年龄由小到大排序。
姓名（String）	年龄（int）	分数（float）
liusan	20	90.0F
lisi	22	90.0F
wangwu	20	99.0F
sunliu	22	100.0F
     */
    public static void main(String[] args) {
        //存取对象
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("liusan",20,90));
        students.add(new Student("lisi",22,90));
        students.add(new Student("sunliu",22,100));
        students.add(new Student("wangwu",20,99));

        //用Comparable接口

    }



}
