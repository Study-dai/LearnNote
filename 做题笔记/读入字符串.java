package package1215;
import java.util.Scanner;
/*读入一个字符串输出字符串中连续最长的数字串
用max表示经过的数字长度最大值，count表示数字计数器，当为字母时重置为0
end表示数字尾部，每次满足数字时，对max进行判断，当max小于于count时，更新max和end
*/
public class Main {
    public static String PrintNum(String str){
        int max=0;
        int end=0;
        int count=0;
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) >='0' && str.charAt(i) <='9') {
                count++;//数字个数
                if(max<count){
                    max=count;
                    end=i;
                }
            }else{
                count=0;
            }
        }
        return str.substring(end-max+1,end+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ret=PrintNum(sc.nextLine());
        System.out.println(ret);
    }
}
