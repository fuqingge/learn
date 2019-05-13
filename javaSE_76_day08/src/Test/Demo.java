package Test;

import Test02.Student;

import java.util.HashMap;

/*
问题：
请用代码描述:
在一款角色扮演游戏中,每一个人都会有名字和生命值;角色的生命值不能为负数
要求:当一个人物的生命值为负数的时候需要抛出自定的异常
 */
public class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setLifeValue(1000);
        person.setLifeValue(-5);

    }

}
