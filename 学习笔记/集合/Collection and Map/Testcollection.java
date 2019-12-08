package packageCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Testcollection {
    public static void main(String[] args) {
        //简单类型不能作为泛型的参数
        //
        //泛型语法、集合中保存的是String类型的若干个对象
        //本身是ArrayList<String>类型
        Collection<String> collection=new ArrayList<String>();
        //使用isEmpaty()和size();
        System.out.println(collection.isEmpty());
        //判断当前集合是不是空,空为true，非空为false
        System.out.println(collection.size());//求集合中的元素个数
        //使用add
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        //使用toArray
        Object [] arr=collection.toArray();//类型强制转换
        System.out.println(Arrays.toString(arr));

        System.out.println("使用for each遍历集合类");
        for(String s:collection){
            System.out.println(s);
        }

        //使用contains方法(查看元素是否在集合中)
        boolean ret=collection.contains("赵六");
        boolean ret2=collection.contains("王五");
        System.out.println("ret="+ret+"  ret2="+ret2);

        //删除方法
        System.out.println("删除张三元素");
        collection.remove("张三");
        for(String s:collection){
            System.out.println(s);
        }

        System.out.println("=========================================");
        Collection<String> collection1= new ArrayList<String>();
        System.out.println(collection1.isEmpty());
        System.out.println(collection1.size());
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        System.out.println(collection1.isEmpty());
        System.out.println(collection1.size());
        Object []arrays=collection1.toArray();
        System.out.println(Arrays.toString(arrays));
        System.out.println();
    }
}

