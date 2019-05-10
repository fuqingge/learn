import java.util.Iterator;
import java.util.LinkedList;

public class Test01 {
    /*
    十、已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
    String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，将list中所有元素分别用迭代器和增强for循环打印出来
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        for (String s:strs
             ) {
            if (!list.contains(s)) {
                list.add(s);            }

             //for
            for (String ss:list
                 ) {
                System.out.println(list);
            }

            System.out.println("========================");

            //迭代器
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()){
                String string=iterator.next();
                System.out.println(string);
            }


        }

    }

}
