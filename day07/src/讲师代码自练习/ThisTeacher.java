package 讲师代码自练习;

public class ThisTeacher {
    private String name ;
    private int age;

    public void teach(){
        System.out.println(name);
    }

    public void setName(String name){
        this.name=name;
    }
    public String setName(){
        return name;
    }

}
