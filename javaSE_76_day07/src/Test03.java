import java.util.HashMap;

public class Test03 {
    /*
    七、有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
    第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
    将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
     */

    public static void main(String[] args) {
        String[] str = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str2 = {"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i <str.length ; i++) {
            map.put(str[i],str2[i]);
        }
        System.out.println(map);
    }
}
