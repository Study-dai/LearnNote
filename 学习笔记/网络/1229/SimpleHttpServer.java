package pachage1228;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleHttpServer {
    public static User[] users;

    public static void main(String[] args) throws IOException {
        //1、建立监听Socket
        ServerSocket serverSocket=new ServerSocket(8888);
        //建立线程池
        ExecutorService pool= Executors.newFixedThreadPool(10);
        //循环读取-发送响应
        while(true){
            //3、等待客户端连接（Chrome）
            Socket socket=serverSocket.accept();
            pool.execute(new Task(socket));
        }
    }
}
