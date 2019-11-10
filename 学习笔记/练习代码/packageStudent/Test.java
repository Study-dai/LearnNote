package packageStudent;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student [] students=new Student[]{
                new Student("张三",99),
                new Student("李四",88),
                new Student("王五",77),
                new Student("赵六",76),
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
