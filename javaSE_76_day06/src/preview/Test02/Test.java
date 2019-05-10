package preview.Test02;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        Student student = new Student("a",1);
        studentHashSet.add(student);
        studentHashSet.add(new Student("b", 23));
        for (Student stu:studentHashSet
             ) {
            System.out.println(studentHashSet);
        }
    }
}
