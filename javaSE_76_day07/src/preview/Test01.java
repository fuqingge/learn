package preview;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        //创建双集合保存牌面
        HashMap<Integer, String> map = new HashMap<>();
        //花色集合
        String[] color = {"♥","♦","♠","♣"};
        //数字集合
        String[] num = {"J","Q","K","A","3","4","5","6","7","8","9","10","2"};
        //将花色和数字存如牌面
        int index = 1;
        ////创建一个arraylist,保存每张牌的key
           ArrayList<Integer> keys = new ArrayList<>();
        for (String n:num
             ) {
            for (String c:color
                 ) {
               String p = n+c;
                map.put(index, p);
                keys.add(index);
                index = index+1;
            }
        }
        map.put(53, "小王");
        map.put(54,"大王");
        keys.add(53);
        keys.add(54);
        //排乱序 sort方法
        Collections.shuffle(keys);

        //发牌 3个人+底牌
        ArrayList<Integer> pocker1 = new ArrayList<>();
        ArrayList<Integer> pocker2 = new ArrayList<>();
        ArrayList<Integer> pocker3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i < keys.size(); i++) {
            if (i >= keys.size() - 3) {
                dipai.add(keys.get(i));
            } else {
                switch (i % 3) {
                    case 0:
                        pocker1.add(keys.get(i));
                        break;
                    case 1:
                        pocker2.add(keys.get(i));
                        break;
                    case 2:
                        pocker3.add(keys.get(i));
                        break;
                }
            }
        }
        //看牌
        showPokers("周润发",pocker1,map);
        showPokers("刘德华",pocker2,map);
        showPokers("周星星",pocker3,map);
        showPokers("底牌",dipai,map);
    }
    private static void showPokers(String name, ArrayList<Integer> keys, HashMap<Integer, String> map) {
        //对键值进行排序
        /*Collections.sort(keys, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });*/
        Collections.sort(keys);
        Collections.reverse(keys);
        //键找值(牌拼接在一起展示)
        String line = "";
        for (Integer key : keys) {
            String poker = map.get(key);
            line += poker+" ";
        }
        System.out.println(name+":"+line);














    }
}
