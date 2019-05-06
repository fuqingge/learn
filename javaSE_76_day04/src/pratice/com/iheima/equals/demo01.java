package pratice.com.iheima.equals;
/*
如果希望进行对象的内容比较，
即所有或指定的部分成员变量相同就判定两个对象相同，则可以覆盖重写equals方法。例如：
 */
public class demo01 {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        demo01 demo01 = (demo01) o;

        if (age != demo01.age) return false;
        return name != null ? name.equals(demo01.name) : demo01.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
