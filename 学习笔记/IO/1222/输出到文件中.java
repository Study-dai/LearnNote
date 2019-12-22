package package1222;

import java.io.*;
/*
public class 输出到文件中 {
    public static void main(String[] args) throws IOException {
        OutputStream os=new FileOutputStream("本地输出文件.txt");
        Writer writer=new OutputStreamWriter(os,"UTF-8");
        writer.write('c');
        writer.write("中国人");
        char[] buffer={'我','爱','我','的','祖','国'};
        writer.write(buffer,0,buffer.length);
        writer.append("\r\nW我爱北京天安门");
        writer.flush();
        writer.close();
    }
    {
        PrintStream out= null;
        try {
            out = new PrintStream("本地输出文件");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        out.println("我是中国人");
        out.println("我是第二行");
        out.println("为中华之崛起而读书");
        out.flush();
        out.close();

    }
    {
        PrintWriter writer =new PrintWriter("本地输出文件.txt","UTF-8");
        writer.printf("%s 你好 %n","外形人");
        writer.println("我是谁");
        while(true){
            Thread.sleep(1000);
        }
    }


}F
*/