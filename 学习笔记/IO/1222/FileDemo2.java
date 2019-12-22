package package1222;

import java.io.File;
//深度优先的遍历
public class FileDemo2 {
    private static void listDirectory(File root,int level){
        File [] files=root.listFiles();
        if(files==null||files.length==0){
            return;
        }
        for(File file: files){
            //缩进
            for (int i = 0; i <level; i++) {
                System.out.println();
            }
            System.out.print(file.getName());
            if(file.isDirectory()){
                System.out.println(File.separator);
            }else{
                System.out.println(file.length());
            }
            if(file.isDirectory()){
                listDirectory(file,level+1);
            }
        }
    }
    public static void main(String[] args)  {
        File root=new File("D:\\IDEA code-1");
        System.out.println(root.getAbsolutePath());
        listDirectory(root,1);
    }
}
