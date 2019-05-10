import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class Test03 {
    /*
    十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
    红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
     */

    public static void main(String[] args) {
        Random random =new Random();
        //红色,同色号码不重复

        //蓝色
        int b = random.nextInt(16)+1;
        HashSet<Integer> hashSet= new HashSet<>();
        //6个不同数字
        while(hashSet.size()<6){
            int a =random.nextInt(33)+1;
            hashSet.add(a);
        }
        System.out.println("双色球中奖号码:");
        System.out.print("红球是: ");
        for (int aa:hashSet
             ) {
            System.out.print(aa+" ");
        }

        System.out.print("蓝色球是: ");
        System.out.println(b);







    }


}
