package pratice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//七、使用SimpleDateFormat类,把2018-03-04 转换为2018年03月04日
public class Test02 {
    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2018-03-04";
        Date date = df.parse(str);

        DateFormat df1 = new SimpleDateFormat("yyyy年-MM月-dd日");
       String string = df1.format(date);
        System.out.println(string);

    }
}
