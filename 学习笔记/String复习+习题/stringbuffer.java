public class stringbuffer {
    //StringBuffer和StringBulider
  /*
        String类特点：
        1、任何字符串常量都是String对象
        2、String常量一旦声明，不可改变
        3、如果要改变，改变的是其引用的指向
        由于String的不可更改的特性，为放方便字符串的修改，
        提供StringBuffer和StringBulider类
        StringBuffer和StringBulider大部分功能相同
   */
    //在String中使用"+"来进行字符串连接，但是这个操作在StringBuffer类中需要更改为append()方法:

    public static void fun(StringBuffer tmp){
        tmp.append("\n").append("www.dai.com");
    }
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        //StringBuffer中的append（）相当于String中的+操作和cancat操作
        sb.append("hello").append("world");
        fun(sb);
        System.out.println(sb);
//=====================================================
//String和StringBuffer都是CharSequence接口的子类
        //这个接口描述的是一系列的字符集，所以字符串是字符集的子类
        //String 和StringBuffer不能相互转换
        //如果要转换：
        //String 转StringBuffer ：利用StringBuffer的构造方法或append()方法
        //StringBuffer转String 调用toString()方法。
//StringBuffer中String没有的方法
        //字符串反转：
        //public synchronized StringBuffer reverse();
        StringBuffer sb1=new StringBuffer("hello");
        System.out.println(sb1.reverse());//olleh
        //删除指定范围数据：
        StringBuffer sb3=new StringBuffer("helloworld");
        //删除从第5号下标到第10号下标的字符
        System.out.println(sb3.delete(5,10));//hello
        //插入数据
        StringBuffer sb4=new StringBuffer("helloworld");
        System.out.println(sb4.delete(5,10).insert(0,"你好"));
        //你好hello  从0号下标之前插入，先输出插入的
        System.out.println(sb4.delete(5,10).insert(2,"你好"));
        //he你好llo
    }
}
/*
解释：String StringBuffer  StringBulider 的区别：
1、String的内容不可修改，StringBuffer和StringBulider的内容可以修改
2、StringBuffer和StringBulider的大部分内容相似
3、StringBuffer采用同步处理，属与线程安全操作，StringBulider属于异步处理，属于线程不安全操作
 */