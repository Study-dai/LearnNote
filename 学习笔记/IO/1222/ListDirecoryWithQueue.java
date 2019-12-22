package package1222;
/*
import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

//广度优先的遍历
public class ListDirecoryWithQueue {
    public static class Node {
        File file;
        int level;

        public Node(File file, int level) {
            this.file = file;
            this.level = level;
        }
    }
    public static void main(String[] args) {

        File root=new File("D:\\IDEA code-1");
        Node node=new Node(root,0);
        Queue<File>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            File front=queue.poll();
            System.out.println(front.getName());
            if(!front.isDirectory()){
                continue;
            }
            File[]files=front.listFiles();
            if(files==null||files.length==0){
                continue;
            }
            for(File file : files){
                queue.offer(new Node(file,node.level+1));
            }
        }
    }
}
*/