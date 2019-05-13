package preview.WriteExp;

public class Demo01 {
    //有一个数组，保存姓名
   static  String[] name = {"jack","huahua","rose"};

    public static void main(String[] args) {
  try {
      getName("jack");
      System.out.println("success!");
  }catch (LoginException e){
      //处理异常;
      e.printStackTrace();
  }
    }

    public static boolean  getName(String names) throws LoginException{
        for (String n:name
             ) {
                 if (n.equals(names)){
                     throw new LoginException("已经被注册"+name);
                 }
        }return true;
    }

}
