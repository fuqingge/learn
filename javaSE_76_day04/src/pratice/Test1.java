package pratice;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
六、
请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
 */
public class Test1 {
    public static void main(String[] args) {
       Date date = new Date();

      DateFormat format =new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");

      String str = format.format(date);
        System.out.println(str);
    }
}
