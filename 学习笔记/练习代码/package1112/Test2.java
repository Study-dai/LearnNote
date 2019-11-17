package package1112;

import java.util.*;

class student{
    private String name;
    private String cals;
    private double score;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", cals='" + cals + '\'' +
                ", score=" + score +
                '}';
    }

    public student(String name, String cals, double score) {
        this.name = name;
        this.cals = cals;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCals() {
        return cals;
    }

    public void setCals(String cals) {
        this.cals = cals;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
public class Test2 {
    public static void main(String[] args) {
        List<student>list=new ArrayList<>();
       list.add(new student("刘备","一班",80));
       list.add(new student("张飞","二班",90));
       list.add(new student("关羽","三班",87));
       list.add(new student("赵云","一班",15));
       list.add(new student("曹操","三班",78));
        //打印
       for(student student:list){
            System.out.println(student);
        }

    }
}
