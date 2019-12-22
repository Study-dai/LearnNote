package package1222;

import java.io.File;

//不求甚解
/*
硬盘IO（文件）
网络IO（Socket）
标准输入输出 标准错误
System.in
System.out
System.err
内存虚拟IO
流（stream）概念
 */
public class IODemo {
    public static void main(String[] args) {
        File file=new File("D:\\");
        //判断文件是否存在
        System.out.println(file.exists());
        //得到文件的名字
        System.out.println(file.getName());
        //判断是不是文件夹
        System.out.println(file.isDirectory());
        //
        System.out.println(file.getFreeSpace());
        //判断可用空间还有多少
        System.out.println(file.getUsableSpace());
        //判断容量有多少
        System.out.println(file.getTotalSpace());


        //可执行/可读/可写
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        //和你当前在何处无关的路径就是绝对路径
        //以盘符开始的就是绝对路径
        System.out.println("是否存在/是文件夹/是文件/绝对路径/隐藏");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());

        System.out.println("该文件所在盘符的空间情况");
        System.out.println(file.getTotalSpace());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getUsableSpace());

        System.out.println("文件大小/名字/上次修改时间");
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.lastModified());
    }
    public static void 获取所有的Properties(){
        System.getProperties().list(System.out);
    }
    public static void 展示相对路径(){
        /**
         * 可以通过修改 Run -> Edit Configurations -> Working directory
         * 实现相对不同的位置
         *
         * 或者在 CMD 通过 java -cp 指定类路径运行
         */
        File file2=new File("一个相对路径");
        System.out.println(file2.getAbsolutePath());
    }
    public static void 操作普通的文件(String [] args){
        File file3=new File("测试目录文件//hello。java");
    }

}
