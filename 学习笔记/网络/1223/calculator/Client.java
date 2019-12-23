package package1223.calculator;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        while (true) {
            System.out.println("请输入要发送的消息：");
            String nessage = sc.nextLine();
            byte[] sendbuffer = nessage.getBytes("UTF-8");
            //InetAddress address = InetAddress.getLocalHost();
            InetAddress address=InetAddress.getByAddress(
                    new byte[]{(byte)192, (byte)168,(byte)3,(byte)175}
            );
            int port = 8888;
            DatagramPacket sendPackaget = new DatagramPacket(
                    sendbuffer,
                    0,
                    sendbuffer.length,
                    address,
                    port
            );
            socket.send(sendPackaget);
            byte[] receiveBuffer = new byte[4096];
            DatagramPacket receivePacket = new DatagramPacket(
                    receiveBuffer,
                    0,
                    receiveBuffer.length
            );
            socket.receive(receivePacket);
            String echoMessage = new String(receiveBuffer, 0, receivePacket.getLength());
            System.out.println(echoMessage);
            socket.close();
        }
    }
}