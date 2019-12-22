package package1222;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File dai=new File("D:\\IDEA code-1");
        if(dai.exists()&&dai.isDirectory()){
            File [] result=dai.listFiles();
            for(File file2 :result){
                System.out.println(file2);
            }
        }
    }
}
/*
执行结果：
D:\IDEA code-1\javaSE
D:\IDEA code-1\javaSE-2
D:\IDEA code-1\javaSE-3
D:\IDEA code-1\javaWeb
D:\IDEA code-1\JDBCcode
D:\IDEA code-1\String
D:\IDEA code-1\图形化界面
D:\IDEA code-1\每天一题
D:\IDEA code-1\测试目录
 */