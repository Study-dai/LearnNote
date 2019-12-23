package package1223.calculator;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        while (true) {
            byte[] buffer = new byte[4096];
            DatagramPacket receivePacket = new DatagramPacket(buffer, 0, buffer.length);
            socket.receive(receivePacket);
            int len = receivePacket.getLength();

            String message = new String(buffer, 0, len, "UTF-8");
            String echoMessage = message;
            byte[] sendBuffer = echoMessage.getBytes("UTF-8");
            DatagramPacket sendPackat = new DatagramPacket(
                    sendBuffer,
                    0,
                    sendBuffer.length,
                    receivePacket.getAddress(),
                    receivePacket.getPort()
            );
            socket.send(sendPackat);
        }
    }
}
