package package1217;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IODemo {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter=new PrintWriter("hello.txt","utf8");
        printWriter.println("你好");
        printWriter.println("我是中国人");
        printWriter.printf("%d:我进来了%n",18);
        printWriter.close();
    }
}
