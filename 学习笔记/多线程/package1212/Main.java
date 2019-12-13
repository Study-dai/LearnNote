package package1212;
import java.util.Arrays;
//了解枚举
public class Main {
    enum Week{
        mon,tue,wen,thus,fir,sat,sun
    }
    public static void main(String[] args) {
        Week week= Week.mon;
        Week[] values=week.values();
        System.out.println(Arrays.toString(values));
        switch(week){
            case mon:
            case tue:
            case wen:
            case thus:
            case fir:
            case sat:
            case sun:
        }
    }
}
//执行结果：
//[mon, tue, wen, thus, fir, sat, sun]