package packageLinkedList;

public class TestLinkedLIst {
    public static void main(String [] args){
        TestAddFirst();
        TestAddlast();
        TestAddIndex();
        TestContains();
        TestRemove();
        TestremoveallKey();
        TestClear();
    }
    public static void TestAddFirst(){
        System.out.println("测试头插");
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
    }
    public static void TestAddlast(){
        System.out.println("测试尾插");
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(8);
        list.display();
    }
    public static void TestAddIndex(){
        System.out.println("测试中间插入方法");
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
        //在2的后一个位置插入一个5
        //测试的四种情况
        //1、选择非法下标（-1）
        //2、选择0号下标
        //3、选择跟size一样长的下标
        //4、选择0到size之间的下标
        //每一种类别的测试数据中，挑一两个典型代表出来就行
        list.addIndex(1,5);
        list.display();
    }
    public static void TestContains(){
        System.out.println("测试是否包含关键字key的方法");
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
        boolean ret=list.contains(3);
        System.out.println("预期ret=true,实际是ret="+ret);
    }
    public static void TestRemove(){
        System.out.println("测试删除链表中的元素");
        //要测试的点：
        //1.空链表
        //2.删除头部结点
        //3.删除普通结点
        //4.删除一个不存在的元素
        //5.删除重复元素
        //6.删除尾部结点
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
        //删除3这个元素所在的结点
        list.remove(3);
        list.display();
    }
    public static void TestremoveallKey(){
        System.out.println("测试删除所有值为key的结点");
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.display();
        list.removeAllkey(3);
        list.display();
    }
    public static void TestClear(){
        System.out.println("测试清除链表的方法");
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
        list.Clear();
        list.display();
    }
}

