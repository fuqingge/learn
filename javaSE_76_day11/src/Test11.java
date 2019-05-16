public class Test11 {
    /*
    描述:猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，又多吃了一个。
    第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
    以后每天都吃了前一天剩下的一半多一个。到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
    每天吃掉的n/2+1

     */

    public static void main(String[] args) {
    int peach= peach(1);
        System.out.println(peach);
    }

    public static int peach(int a){
      if (a ==10){
          return 1;
      }else{
          return 2 * peach(a + 1) + 2;
      }


    }

}
