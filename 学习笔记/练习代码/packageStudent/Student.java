package packageStudent;

public class Student implements Comparable{
    private String name;
    private int score;
    //构造方法
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    //重写方法
    @Override
    public String toString() {
        return "["+this.name+":"+this.score+"]";
    }
    //重写方法
    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.score > s.score) {
            return -1;
        } else if (this.score < s.score) {
            return 1;
        } else {
            return 0;
        }
    }
}
