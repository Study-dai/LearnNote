package packageSeqList;
public class Test {
    public static void main(String [] args) {
        TestAdd();
        TestContains();
        TestSearch();
        TestGetpos();
        TestSetpos();
        TestRemove();
        Testsize();
        Testclaer();
    }
    public static void TestAdd() {
        System.out.println("测试add方法：");
        SeqList seqList = new SeqList();
        seqList.add(0, 10);
        seqList.add(1, 20);
        seqList.add(2, 30);
        seqList.display();
        seqList.add(3, 10);
        seqList.display();
    }
    public static void TestContains(){
        System.out.println("测试contains方法：");
        SeqList seqList = new SeqList();
        seqList.add(0, 10);
        seqList.add(1, 20);
        seqList.add(2, 30);
        seqList.display();
        boolean ret=seqList.contains(20);
        System.out.println(ret);
    }
    public static void TestSearch(){
        System.out.println("测试search方法：");
        SeqList seqList = new SeqList();
        seqList.add(0, 10);
        seqList.add(1, 20);
        seqList.add(2, 30);
        seqList.display();
        int  sret=seqList.search(20);
        System.out.println(sret);
    }
    public static void TestGetpos(){
        System.out.println("测试getpos方法");
        SeqList seqList=new SeqList();
        seqList.add( 0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        int getter= seqList.getPos(0);
        System.out.println(getter);
    }
    public static void TestSetpos() {
        System.out.println("测试setpos方法");
        SeqList seqList = new SeqList();
        seqList.add(0, 10);
        seqList.add(1, 20);
        seqList.add(2, 30);
        seqList.display();
        seqList.display();
        //System.out.println(setter);
    }
    public static void TestRemove(){
        System.out.println("测试remove方法");
        SeqList seqList=new SeqList();
        seqList.add( 0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        seqList.remove(10);
        System.out.println("预期值：[20,30]");
        System.out.printf("实际值：");
        seqList.display();
    }
    public static void Testsize(){
        System.out.println("测试size方法");
        SeqList seqList=new SeqList();
        seqList.add( 0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        System.out.println(seqList.size());
    }
    public static void Testclaer(){
        System.out.println("测试clear方法");
        SeqList seqList=new SeqList();
        seqList.add( 0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        seqList.claer();
        seqList.display();
    }
}

