package package1222;

import java.io.*;
import java.util.Scanner;
/*
public class InputStresm2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\IDEA code-1\\javaWeb\\src\\package1222\\本地文件.txt");
        Reader reader = new InputStreamReader(is, "UTF8");
        StringBuffer sb1 = new StringBuffer();
        char[] buffer = new char[1024];
        int len;

        while ((len = reader.read(buffer)) != -1) {
            sb1.append(buffer, 0, len);
        }
        System.out.println(sb1.toString());
        reader.close();
        StringBuffer sb2 = new StringBuffer();
        int c;
        while ((c = reader.read()) != -1) {
            char cb = (char) c;
            sb2.append(cb);
        }
        System.out.println(sb2.toString());
    }
    {
        InputStream is= null;
        try {
            is = new FileInputStream("D:\\IDEA code-1\\javaWeb\\src\\package1222\\本地文件.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Reader reader= null;
        try {
            reader = new InputStreamReader(is,"UTF8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader=new BufferedReader(reader);
        StringBuilder sb=new StringBuilder();
        String line;
        while ((line=bufferedReader.readLine())!=null) {
            sb.append(line);
            sb.append("\r\n");
        }
        System.out.println(sb.toString());
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    {
        InputStresm2 is=new FileInputStream("本地文件.txt");
        Scanner sc1=new Scanner(is,"UTF8");
        Reader reader=new InputStreamReader(is,"UTF8");
        Scanner sc2=
    }

}
*/