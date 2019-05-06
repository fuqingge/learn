package pratice;


import java.util.Calendar;
import java.util.Date;

//七、用程序判断2018年2月14日是星期几
public class test03 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //设置年月日
        cal.set(Calendar.YEAR,2018);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DAY_OF_MONTH,14);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        char week = getWeek(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(week);
    }

    public static char getWeek(int a){
        char[] week = {' ','日','一','二','三','四','五','六'};
        return week[a];
    }
}
