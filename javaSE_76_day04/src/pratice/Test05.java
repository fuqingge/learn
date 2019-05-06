package pratice;
//分别使用String的 += 和StringBuilder的append方法对字符串做100000次拼接，
// 计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。
//public class StringBuilder01 {
public class Test05 {
    public static void main(String[] args) {
       long start = System.currentTimeMillis();
       getString();
       long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void getString(){
        StringBuilder stringBuilder = new StringBuilder("world");
        for (int i = 0; i <10000 ; i++) {
            stringBuilder.append("a");
        }
        String newStr = stringBuilder.toString();
    }

}
