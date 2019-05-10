package Test08;
//十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
public class Test08 {
    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3, 4, 5};
        method(a1,0,1);
    }


    public static <A> void method(A[] as,int a,int b){
            A temp;
            temp = as[a];
            as[a] = as [b];
            as[b] = temp;
            System.out.println(as[a]+","+as[b]);

    }
}
