package packageString;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        StringBuilder stringBuffer=new StringBuilder();
//        while(true){
//            stringBuffer.append(scanner.next());
//            System.out.println(stringBuffer);
//        }

        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String [] value=str.split(" ");
        String ret="";
        for (int i = 0; i <value.length ; i++) {
            ret+=value[i];
        }
        System.out.println(ret);


        //String strs=scanner.nextLine();
        String [] strs=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String s:strs){

        }








//        String str="hello";
//        System.out.println(str.charAt(0));//下标从0开始
//        //执行结果
//        //h
//
//        System.out.println(str.charAt(10));
//        //执行结果
//        //抛出空指针异常


//        String str2="helloworld";//将字符串与字符数组的转换
//        char [] data=str2.toCharArray();
//        for (int i = 0; i <data.length ; i++) {
//            System.out.println(data[i]+" ");
//        }
//
//        //字符数组转为字符串
//        System.out.println(new String(data));//全部转化
//        System.out.println(new String(data,5,5));//部分转化



        //创建String方式一
        //String str1="dai";//"dai"这样的字符串字面值常量，类型也是String
        //创建String方式二
       // String str3= new String("召");//String也是引用类型，string str="hello";
        //创建String方式三
//       char [] arr={'a','b','c'};
//      // String str3=new String(arr);
//        int x=0;
//        int y=0;
//        System.out.println(x==y);
//        String s1="ggg";
//        String s2="ggg";
//        System.out.println(s1==s2);
//



//        String s3=new String("qqq");
//        String s4=new String("qqq");
//        System.out.println(s3==s4);
//        String st=null;
//        if("hehe".equals(st)){
//            System.out.println(1);
//        }else{
//            System.out.println(0);
//        }
//        String aa=new String("hehe").intern();
//        String bb="hehe";
//        System.out.println(aa==bb);



//        String bg="daina";
//        bg="hq"+bg.substring(1);
//        System.out.println(bg);
//
//        try {
//            //1、获取到value这个字段对应的对象
//            Field valueField =String.class.getDeclaredField("value");
//            //2、让value对应的对象可以被访问到,强行破坏封装
//            valueField.setAccessible(true);
//            //3、根据valueField对象和str对象，找到str中的value数组
//            try {
//                char [] value=(char [])valueField.get(str1);
//                //4.修改value
//                value[0]='a';
//                System.out.println(str1);
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//        String  w="hqw";
//        for (int i = 0; i <10000 ; i++) {
//            w+=i;
//        }
//        System.out.println(w);
//

    }
}
