package Test5;
/*
FightAble select(String str)
- 法力角色，选择法师。
- 武力角色，选择战士。
 */
public class Player {
    public FightAble FightAble_select(String str) {
        if ("法力角色".equals(str)) {
          return new FightAbleImp_2();
        }else if ("武力角色".equals(str)){
            return new FightAbleImp();
        }
        return null;
    }
}
