package package1222;
import java.io.*;

public class InputStream {
    public static void charsetEncodeAndDecode() throws IOException {
        String s = "你好中国";
        byte[] utf8 = s.getBytes("UTF-8");
        byte[] gbk = s.getBytes("GBK");

        System.out.println(new String(utf8, 0, utf8.length, "UTF-8"));
        System.out.println(new String(gbk, 0, gbk.length, "GBK"));
    }

    public static void main(String[] args) throws IOException {
      //  InputStream is = 获取一个输入字节流();
     //   String message = 从一个输入字节流中得到最终的字符(is);
      //  System.out.println(message);
    }

    private static String 从一个输入字节流中得到最终的字符(InputStream is) throws IOException {
        // 假设流的长度一定是小于 8192
        /*
        byte[] buffer = new byte[8192];
        int len = 8192;
        for (int i = 0; i < buffer.length; i++) {
            int b = is.read();
            if (b == -1) {
                len = i;
                break;
            }
            buffer[i] = (byte)b;
        }
        */
        /*
        int len = is.read(buffer);
        String s = new String(buffer, 0, len, "UTF-8");
        return s;
         */

        /*
        // 用一个字节流得到字符流（字节流是该字符流的源）
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] buffer = new char[1024];
        int len = reader.read(buffer);
        return new String(buffer, 0, len);
         */
/*
        Reader reader = new InputStreamReader(is, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int c = bufferedReader.read();
        if (c == -1) {
            System.out.println("读完了");
        } else {
            char cb = (char)c;
        }
        //return bufferedReader.readLine();

        /*
        Scanner scanner = new Scanner(is, "UTF-8");
        return scanner.nextLine();
         */
        return "";
    }
    /*
    private static InputStream 获取一个输入字节流() throws IOException {
        InputStream is;
       is = new FileInputStream("本地文件.txt");
      return is;
    }
    */
}
