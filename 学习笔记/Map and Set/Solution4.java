package package1203;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//旧键盘上坏了几个键，于是在敲一段文字的时候，
// 对应的字符就不会出现。现在给出应该输入的一段文字、
// 以及实际被输入的文字，请你列出肯定坏掉的那些键。
//输入在2行中分别给出应该输入的文字、以及实际被输入的文字。
// 每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
//以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String  str2=scanner.nextLine();
        Set<Character>setAct=new HashSet<>();
        for(char ch:str2.toUpperCase().toCharArray()){
            setAct.add(ch);
        }
        //setAct集合当中存放的是真实的字符
        Set<Character>setBroken=new HashSet<>();
        for(char ch :str1.toUpperCase().toCharArray()){
            //此条件成立代表当前ch为坏掉的
            if(!setAct.contains(ch)&&!setBroken.contains(ch)){
                setBroken.add(ch);
                System.out.print(ch);
            }
        }
        //System.out.println(setBroken);
    }
}
