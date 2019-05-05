package test1;
/*
定义HandleAble接口，具备一个处理字符串数字的抽象方法方法HandleString（String num）。
- 处理方式1：取整数部分。
- 处理方式2：保留指定位小数，四舍五入。
 */
public interface HandleAble {
    public abstract String handleString(String str);
}
