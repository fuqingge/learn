package Test02;

public class Student {
    private int flag;
    private String name;
    private int score;

    public Student(int flag,String name ,int score) {
        setScore(score);
        setFlag(flag);
        setName(name);
    }

    public Student(){

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score<0){
            throw new StudentException("不能为负数！");
        }
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {

        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
