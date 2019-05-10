import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
    /*
    九、利用Map，完成下面的功能：
从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
如果该 年没有举办世界杯，则输出：没有举办世界杯。
//tips:参阅Map接口containsKey(Object key)方法

十、在原有世界杯Map 的基础上，增加如下功能： 读入一支球队的名字，输出该球队夺冠的年份列表。
例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002 读入“荷兰”，应当输出 没有获得过世界杯
 */
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2001, "china");
        map.put(2006, "spaina");
        map.put(2006, "spaina");


        System.out.println("请输入年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (map.containsKey(year)) {
            System.out.println(map.get(year));
        } else {
            System.out.println("没有举办世界杯");
        }

        System.out.println("请输入球队：");
        Scanner scanner1 = new Scanner(System.in);
        String ball = scanner1.nextLine();
        if (map.containsValue(ball)) {
            for (Integer i : map.keySet()) {
                if (map.get(i).equals(ball)) {
                    System.out.println(i + "、\n");
                }
            }
        } else {
            System.out.println("该国家没有获得世界杯冠军");
        }

    }
}





