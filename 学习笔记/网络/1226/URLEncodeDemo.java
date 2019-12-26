package package1226;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncodeDemo {
    public static void main(String[] args) throws IOException {
        String s = "c++";
        String r = URLEncoder.encode(s, "UTF-8");
        System.out.println(r);

        s = URLDecoder.decode(r, "UTF-8");
        System.out.println(s);
    }
}
/**
 * 执行结果：
 * c%2B%2B
 * c++
 */
