package package1112;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestDemo1 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add(0,"张三");
        list.add(1,"李四");
        list.add(2,"王五");
        list.add(3,"赵六");
        list.add(4,"孙七");
        System.out.println(list);
    //和数组一样可以添加重复元素
        list.add("张三");
    //类似数组下标方式的访问
        System.out.println(list.get(0));
    //截取部分[1,3)
    List<String> list2=list.subList(1,3);
        System.out.println(list2);
    //重新构造
        List<String>list3=new ArrayList<>();
        System.out.println(list3);

        List<String>list4=new ArrayList<>();
        System.out.println(list4);
    //引用转换
        ArrayList<String> list5=(ArrayList<String>)list3;
        System.out.println(list5);

        //LinkedList<String> c=(LinkedList<String>)list2;

        LinkedList<String>list6=(LinkedList<String>)list4;
        System.out.println(list6);



//截取部分List不会产生新对象








    }
}
//接口和接口之间的关系
//接口和类之间的关系
//集合类的底层是数据结构