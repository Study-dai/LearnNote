package package1125;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/*大跟堆： 根节点大于左右孩子
  小跟堆: 根节点小于左右孩子
        1、建堆：
        parent child 代表孩子结点的最大值下标
        2、向下调整 最后一棵树开始 每棵树都要调整
        3、
        4、依次调整
        1。如何找到最后一棵树
        如果已知孩子结点x，求父节点下标y=(x-1)\2
        已知父节点下标x,求左右孩子结点下标2x+1 2x+2
        arr[child]>arr[parent] 交换  child和len关系
        child <len
        child+1<len
        统一的调整方法
        AdjustDown
 */
public class TestDemo {
    //小根堆
    public static void main(String[] args) {
        Queue<Integer>queue=new PriorityQueue<>();
        //int [] arr={13,8,2,7,10,9,11,15,12,6};
        queue.offer(120);
        queue.offer(15);
        queue.offer(11);
       int a=queue.poll();
        System.out.println(a);
    }

    public static void main1(String[] args) {
        int [] arr={13,8,2,7,10,9,11,15,12,6};
        TestHeep testHeep=new TestHeep();
        testHeep.createHeeap(arr);
        testHeep.display();
        //System.out.println(Arrays.toString(arr));
        testHeep.pushHeap(14);
        testHeep.display();
        testHeep.popHeap();
        testHeep.display();
        int ret=testHeep.getPop();
        System.out.println(ret);
    }
}
