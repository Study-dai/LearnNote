package pachage1228;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Task implements Runnable {
    private final Socket socket;

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            // 读取请求并解析
            Request request = Request.parse(is);
            System.out.println(request);
            // 处理业务
            if (request.path.equals("/hello")) {
                String body = "<h1>你好</h1>";
                byte[] bodyBytes = body.getBytes("UTF-8");

                // 拼接响应并发送
                StringBuilder responseSB = new StringBuilder();
                responseSB.append("HTTP/1.0 200 OK\r\n");
                responseSB.append("Content-Type: text/plain;charset=UTF-8\r\n");
                responseSB.append("Content-Length: ");
                responseSB.append(bodyBytes.length);
                responseSB.append("\r\n");
                responseSB.append("\r\n");
                responseSB.append(body);
                // 发送响应
                os.write(responseSB.toString().getBytes("UTF-8"));
                os.flush();
            } else if (request.path.equals("/run")) {
                String body = "<script src='/joke.js'></script>";
                byte[] bodyBytes = body.getBytes("UTF-8");

                // 拼接响应并发送
                StringBuilder responseSB = new StringBuilder();
                responseSB.append("HTTP/1.0 200 OK\r\n");
                responseSB.append("Content-Type: text/html;charset=UTF-8\r\n");
                responseSB.append("Content-Length: ");
                responseSB.append(bodyBytes.length);
                responseSB.append("\r\n");
                responseSB.append("\r\n");
                responseSB.append(body);
                // 发送响应
                os.write(responseSB.toString().getBytes("UTF-8"));
                os.flush();
            } else if (request.path.equals("/joke.js")) {
                String body = "alert('不给糖果就捣蛋');";
                byte[] bodyBytes = body.getBytes("UTF-8");

                // 拼接响应并发送
                StringBuilder responseSB = new StringBuilder();
                responseSB.append("HTTP/1.0 200 OK\r\n");
                responseSB.append("Content-Type: application/javascript;charset=UTF-8\r\n");
                responseSB.append("Content-Length: ");
                responseSB.append(bodyBytes.length);
                responseSB.append("\r\n");
                responseSB.append("\r\n");
                responseSB.append(body);
                // 发送响应
                os.write(responseSB.toString().getBytes("UTF-8"));
                os.flush();
            } else if (request.path.equals("/move")) {
                StringBuilder responseSB = new StringBuilder();
                responseSB.append("HTTP/1.0 307 Temporary Redirect\r\n");
                responseSB.append("Location: https://www.baidu.com/\r\n");
                responseSB.append("\r\n");
                // 发送响应
                os.write(responseSB.toString().getBytes("UTF-8"));
                os.flush();
            } else if (request.path.equals("/set-cookie")) {
                StringBuilder responseSB = new StringBuilder();
                responseSB.append("HTTP/1.0 200 OK\r\n");
                responseSB.append("Set-Cookie: name=peixinchen; expires=Mon, 06-Apr-2020 03:41:01 GMT; Max-Age=8640000\r\n");
                responseSB.append("Set-Cookie: age=34; expires=Mon, 06-Apr-2020 03:41:01 GMT; Max-Age=8640000\r\n");
                responseSB.append("\r\n");
                // 发送响应
                os.write(responseSB.toString().getBytes("UTF-8"));
                os.flush();
            } else if (request.path.contains("/login")) {
                // 获取当前登陆的用户名
                String username = request.path.split("=")[1];
                // 判断是否是登陆用户
                User currentUser = null;
                for (User user :SimpleHttpServer.users ) {
                    if (user.username.equals(username)) {
                        currentUser = user;
                    }
                }
                if (currentUser == null) {
                    // response 一个登陆失败

                }

                // 保存 session
                String filename = String.format("sessions/%s.session", currentUser.id);
                OutputStream fileOS = new FileOutputStream(filename);
                ObjectOutputStream oos = new ObjectOutputStream(fileOS);
                oos.writeObject(currentUser);
                fileOS.close();

                // 返回 response 登陆成功，并且种 cookie
                String body = "<h1>恭喜，登陆成功</h1>";
                StringBuilder responseSB = new StringBuilder();
                responseSB.append("HTTP/1.0 200 OK\r\n");
                responseSB.append("Content-Type: text/html;charset=UTF-8\r\n");
                responseSB.append("Content-Length: ");
                responseSB.append(body.getBytes("UTF-8").length);
                responseSB.append("\r\n");
                responseSB.append("Set-Cookie: session_id=");
                responseSB.append(currentUser.id);
                responseSB.append("\r\n");
                responseSB.append("\r\n");
                responseSB.append(body);
                // 发送响应
                os.write(responseSB.toString().getBytes("UTF-8"));
                os.flush();
            } else {
                StringBuilder responseSB = new StringBuilder();
                responseSB.append("HTTP/1.0 404 Not Found\r\n");
                responseSB.append("\r\n");
                // 发送响应
                os.write(responseSB.toString().getBytes("UTF-8"));
                os.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
