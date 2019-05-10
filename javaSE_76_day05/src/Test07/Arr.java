package Test07;
//十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
public class Arr {
    public static void main(String[] args) {
        Integer[] a = {1,2,4,5};
        method(a);
    }

    public static<T> void method (T[] t){
        for (int min =0, max = t.length-1;min<max;min++,max--){
          T temp ;
          temp = t[min];
          t[min] = t[max];
          t[max] = temp;
        }

        for (int i = 0; i <t.length ; i++) {
            System.out.println(t[i]);
        }

    }

}
