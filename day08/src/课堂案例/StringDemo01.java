package 课堂案例;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "AB";
        String s3 = "AB";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
    }



}
