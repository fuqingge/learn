package preview;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        //说明不能存取重复元素
        hash.add(1);
        hash.add(1);
        hash.add(2);
        System.out.println(hash);
    }
}
