package package1;

public class Test {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        //判断两个字符串是否相等
        System.out.println(str1==str2);//true
        //str1和str指向同一个对象


        String str3=new String("hello");
        String str4=new String("hello");
        System.out.println(str3==str4);//false
        //str3和str4是两个对象
//String使用==进行字符串比较，不是比较内容，比较的是否是指向同一个对象。

        //要比较字符串的内容，使用equals方法
        System.out.println(str3.equals(str4));//true
        //如果str3为null 则会抛出异常
        System.out.println(str3.equals("hello"));
        //推荐使用这个写法
        System.out.println("hello".equals(str3));

        //字符串常量池
        String str6="helloString";
        String str7="helloString";
        String str8="helloString";
        //这种情况，hello在内存中只有一份，但是有三个引用指向它
        //这个helloString就是在字符串常量池中

        //intren（）方法
        String s1=new String("dai");
        String s2="dai";
        System.out.println(s1==s2);//false
        //s1,s2,指向的是两个对象

        String s3=new String("qwe").intern();
        String s4="qwe";
        System.out.println(s3==s4);
        //此时qwe就只有一份，存在字符串常量池中

        //字符串是一种不可变对象，它的内容不可变
        String q1="hello";
        q1=q1+" world";
        q1+="!!!";
        System.out.println(q1);//hello world!!!
        //使用+=之后，q1打印的结果变量，但不是q1本身发生变换，是q1引用到其了他对象；

//修改字符串  将"Hello"改成"hello"
        String str="Hello";
        str=str.substring(4);
        System.out.println(str);//hello
        //subString(n),删除字符串的前n个字符，然后输出。
        //为啥String要不可变，好处是什么
        //1、方便实现字符串对象池
        //2、不可变对象时线程安全的
        //3、不可变对象更方便缓存hashcode,作为key是更高效的保存hashMap


        //字符与字符串
        //获取指定位置的字符charAt(n),下标从0开始
        String q="hello";
        System.out.println(q.charAt(1));//e
        //System.out.println(q.charAt(6));//产生空指针异常

//字符串与字符数组相互转换
        String abc="helloworld";
        //字符串变成字符数组
        char [] data=abc.toCharArray();
        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+" ");
        }//h e l l o w o r l d
        //字符数组转换成字符串
        System.out.println(new String(data));//全部转换helloworld
        System.out.println(new String(data,5,5));
        //部分转换 从第5个开始，往后5个   world

//字节与字符串
        //String转换成byte[]
        String se="helloworld";
        byte data1[] =se.getBytes();
        for (int i = 0; i <data.length; i++) {
            System.out.print(data1[i]+" ");
        }//104 101 108 108 111 119 111 114 108 100
        //上面的值都是ACSII表中对应的字母的值
        //byte[]转String
        System.out.println(new String(data));//helloword
//byte[]是把S同日ing按照一个字节一个字节的方式处理，这种适合在网络传输，数据存储这样的场景下使用，针对二进制数字。
//char[]是把String按照一个字符一个字符的方式进行处理，更适合针对文本数据操作


//字符串常见操作
        String w1="hello";
        String w2="Hello";
        //区分大小写
        System.out.println(w1.equals(w2));//false
        //不区分大小写
        System.out.println(w1.equalsIgnoreCase(w2));//true
        //compareTo()方法
        System.out.println("A".compareTo("A"));//相等返回 0
        System.out.println("A".compareTo("a"));//小于返回负数-32
        System.out.println("b".compareTo("B"));//大于返回正数32
        System.out.println("1".compareTo("2"));//-1
        //相当于用前一个减去后一个

//字符串查找：从一个完整的字符串中可以判断指定内容是否存在
        //判断一个子字符串是否存在
        String w3="helloworld";
        System.out.println(w3.contains("world"));//true

        //从头开始查找指定字符串的位置，找到返回位置的索引，找不到返回-1
        System.out.println(w3.indexOf("world"));//5 w位置的索引
        System.out.println(w3.indexOf("q"));//-1 没找到
        //如果内容重复，只能返回第一个找到的位置的值
        System.out.println(w3.indexOf("l"));//2 第一个l位置索引
        System.out.println(w3.indexOf("l",5));
        //从第5号下标开始查找"l","l"在第8号索引
        System.out.println(w3.lastIndexOf("l"));//返回"l"最后一次出现的索引

//判断开头或者结尾
        System.out.println(w3.startsWith("h"));//true
        System.out.println(w3.endsWith("d"));//true
        System.out.println(w3.startsWith("w",5));
        //判断从5号索引位置时否是w开头。

//字符串替换
        String w4="helloworld";
        System.out.println(w4.replaceAll("l","L"));//heLLoworLd
        //将"l"全部替换成"L";
        System.out.println(w4.replaceFirst("l","L"));//heLloworld
        //只替换第一个出现的l
        //由于字符串是不可变对象，替换不修改当前字符串，而是产生一个新对象

//字符串拆分
        String w5="dai zhao yong";
        //按照空格拆分
        String [] ret=w5.split(" ");
        for (String s:ret) {
            System.out.println(s);
        }
        //dai
        //zhao
        //yong

        //部分拆分
        String [] ret2=w5.split(" ",2);
        for (String s:ret2) {
            System.out.println(s);
        }
        //dai
        //zhao yong
        //拆分IP地址
        String w6="196.168.1.1";
        String [] ret3=w6.split("\\.");
        for(String s:ret3){
            System.out.println(s);
        }
        //196
        //168
        //1
        //1
//多次拆分
        String s="name=zhangsan&age=18";
        String [] ret5=s.split("&");
        for (int i = 0; i <ret5.length; i++) {
            String[] tmp=ret5[i].split("=");
            System.out.println(tmp[0]+"="+tmp[1]);
        }
        //name=zhangsan
        //age=18
 //字符串截取
        //从一个完整字符串中截取出部分内容
        //substring 前闭后开，sunstring（1,5）表示截取[1,5)
        String e1="helloworld";
        System.out.println(e1.substring(5));//从5号下标到结尾  world
        System.out.println(e1.substring(0,5));//从0号下标到五号下标  hello
//其他操作方法
      //去掉左右空格 保留中间空格
      String e2=" hello world ";
        System.out.println(e2.trim());//hello world
        //大小写转换
        String e3=" hello#$%@&*world+-=/";
        System.out.println(e3.toUpperCase());// HELLO#$%@&*WORLD+-=/
        String e4=" HELLO#$%@&*WORLD+-=/";
        System.out.println(e3.toLowerCase());// hello#$%@&*world+-=/
        //这两个方法只转换字母，不转换符号

//字符串length()
        String e5= "hello#$%@&*world+-=/";
        System.out.println(e5.length());//求长度：20
        //数组长度的length是属性，字符串的length是方法。

        //isEmpty()方法,判断是否是空
        System.out.println("hello".isEmpty());//false
        System.out.println("".isEmpty());//true
        System.out.println(new String().isEmpty());
        //新创建的字符串，没有赋值也是null
    }
}
