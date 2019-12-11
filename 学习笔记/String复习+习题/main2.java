package package1;
//String 类并没有提供首字母大写操作，需要自己实现
//示例：首字母大写
public class main2 {
    public static String fistUpper(String str){
        if("".equals(str)||str==null){
            return str;
        }
        if(str.length()>1){
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(fistUpper("helloworld"));//Helloworld
        System.out.println(fistUpper(""));//
        System.out.println(fistUpper("a"));//A

    }
}
