package package1203;

import java.util.HashMap;
import java.util.Map;

//给定一个链表，每个节点包含一个额外增加的随机指针，
// 该指针可以指向链表中的任何节点或空节点。
//要求返回这个链表的深拷贝。
//提示使用Map来写
class Node {
    public int val;
    public Node next;
    public Node random;
    public Node() {}
    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}

public class Solution2 {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        //定义cur从头开始走
        Node cur=head;
        Map<Node,Node>map=new HashMap<>();
        //每一个老的结点对应一个新的结点

        while(cur!=null){
            //cur!=null就建立新的结点
            Node node=new Node(cur.val,null,null);
            //设置cur对应的值为put
            map.put(cur,node);
            cur=cur.next;
        }
        cur=head;
        while (cur!=null){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }
}

















