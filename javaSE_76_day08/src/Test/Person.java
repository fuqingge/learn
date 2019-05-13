package Test;
/*
3. 定义Person类
a)	属性:名称(name)和生命值(lifeValue)
a)	提供空参构造
b)	提供有参构造;
i.	使用setXxx方法给name和lifeValue赋值
c)	提供setter和getter方法
i.	在setLifeValue(int lifeValue)方法中
1.	首先判断,如果 lifeValue为负数,就抛出NoLifeValueException,异常信息为:生命值不能为负数:xxx.
2.	然后在给成员lifeValue赋值.
 */
public class Person {
    private String name ;
    int lifeValue;

    public Person() {
    }

    public Person(String name,int lifeValue) {
        setLifeValue(lifeValue);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {

        return lifeValue;
    }

    /*
    i.	在setLifeValue(int lifeValue)方法中
1.	首先判断,如果 lifeValue为负数,就抛出NoLifeValueException,异常信息为:生命值不能为负数:xxx.
2.	然后在给成员lifeValue赋值.
     */

    public void setLifeValue(int lifeValue){
        if (lifeValue<0){
            throw  new LifeException("生命值不能为负数"+lifeValue);
        }
        this.lifeValue = lifeValue;
    }


}
