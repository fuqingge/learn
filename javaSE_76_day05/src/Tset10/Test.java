package Tset10;

import java.util.ArrayList;

/*
九、(复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
A：遍历集合遍历输出。
B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student("a",1,'女');
        Student student1 = new Student("b",2,'男');
        Student student2 = new Student("c",3,'女');
        ArrayList<Student> arrayList = new ArrayList();
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        print(arrayList);

        //存放最大年龄的索引
        int index = 0;
        //存放nianlin
        int max = 0;
        for (int i = 1; i < arrayList.size(); i++) {
             max = arrayList.get(0).getAge();
            if (max<arrayList.get(i).getAge()){
                max = arrayList.get(i).getAge();
                index = i;
            }
        }

        //年龄最大的学生
        System.out.println("年级最大的学生姓名："+arrayList.get(index).getName());
       arrayList.get(index).setName("小猪佩奇");

    }

    public static void print(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

}
