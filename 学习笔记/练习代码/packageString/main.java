package packageString;

public class main {
    public static void main(String[] args) {
        //10、使用indexOf（）方法进行查找
        String str ="helloworld";
        System.out.println(str.indexOf("world"));//5，w开始的索引
        System.out.println(str.indexOf("dai"));//-1 没找到
        if(str.indexOf("hello")!=-1){
            System.out.println("可以查找到字符串");
            }
        }
    }

 /*
    //9、最方便的字符串查找
    String str="helloworld";
        System.out.println(str.contains("world"));
        //执行结果：true
*/




/*
        //8、观察compareTo（）比较
        System.out.println("A".compareTo("a"));//执行结果：  -32
        System.out.println("a".compareTo("A"));//执行结果：   32
        System.out.println("A".compareTo("A"));//执行结果：   0
        System.out.println("AB".compareTo("AC"));//执行结果： -1
        System.out.println("代".compareTo("码"));//执行结果：-10526
        */
/*    //7、不区分大小写
        String str1="hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));
        //执行结果：false
        System.out.println(str1.equalsIgnoreCase(str2));
        //执行结果：true
*/

/*    //6、实现字符串与字节数组的转换处理
    String str="helloworld";
    //String 转byte[]
    byte [] arr=str.getBytes();
        for (int i = 0; i <arr.length ; i++) {
        System.out.print(arr[i]+" ");
        //执行结果：104 101 108 108 111 119 111 114 108 100
        //byte转String
        System.out.println(new String (arr));
*/



/*
    //5、给定一个字符串，判断是否全部由数字组成
    public static void main(String[] args) {
        //思路:将字符串变成字符数组而判断每一位字符是否是在0-9之间的内容，如果是则为数字
        String str = "q123";
        System.out.println(isNumber(str) ? "字符串中有只有数字！" : "字符串中有非数字成员！");
    }
    public static boolean isNumber(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < '0' || arr[i] > '9') {
                return false;
            }
        }
        return true;
    }
//执行结果：字符串中有非数字成员！
*/




    //   public static void main(String[] args) {
/*
        //4、字符串与字符数组的转换
        String str="helloworld";
        //4.1将字符串转变成数组
         char [] arr=str.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        //执行结果：h e l l o w o l r d
        //4.2字符数组转为字符串
        //System.out.println(new String(arr));       //全部转换
       //执行结果: helloworld
        System.out.println(new String(arr,5,5)); //部分转换
        //执行结果：world
*/




    /*
        //3、获取指定位置的字符
        String str="hello";
        System.out.println(str.charAt(0));
        //执行结果：h
        System.out.println(str.charAt(10));
        //执行结果：StringIndexOutOfBoundsException

*/

/*      //2、修改字符串，使用反射破坏封装，访问一个类内部扥成员
        String str="Hello";
        //获取String类中value字段，这个value和String源码中的value是匹配的
        try {
            Field valueFied=String.class.getDeclaredField("value");
            //将这个字段的访问属性设置为true
            valueFied.setAccessible(true);
            //把str中的value属性获取到
            try {
                char [] value=(char[])valueFied.get(str);
                //修改value的值
                value[0]='h';
                System.out.println(str);
                //执行结果：hello
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

*/



/*
        //1、修改字符串，借助substring();
        String str1="hello";
        String str2="world";
        String str3="javase";
        str1="HELLO"+str1.substring(5);
        str2="H"+str2.substring(1);
        str3="H"+str3.substring(3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //执行结果：HELLO
        //执行结果：Hello
        //执行结果：HELLOello
        //原理;substring(),把  前5个/前1个  字符删除，把前面的加上去
*/


