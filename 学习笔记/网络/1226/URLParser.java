package package1226;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

//URL路径解析
public class URLParser {
    public static void main(String[] args) throws IOException {
        Map<String,Integer>allKonwnPorts=new HashMap<>();
        allKonwnPorts.put("http",80);
        allKonwnPorts.put("https",443);
         String  URL="https://www.baidu.com/s?wd=c%2B%2B&rsv_spt=1&rsv_iq" +
                 "id=0xd0f847e600c86e8a&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=ut" +
                 "f-8&tn=78000241_21_hao_pg&rsv_enter=0&rsv_dl=tb&rsv_sug3=3&" +
                 "rsv_sug1=3&rsv_sug7=100&prefixsug=c%252B%252B&rsp=0&inputT=3832&rsv_sug4=3833";
        int i;
        // 获取 schema
        i = URL.indexOf("://");
        String schema = URL.substring(0, i);
        System.out.println(schema);

        // 获取 host + port
        {
            URL = URL.substring(i + 3);
            i = URL.indexOf("/");
            String hostAndPort = URL.substring(0, i);
            String host;
            int port;
            if (hostAndPort.contains(":")) {
                String[] group = hostAndPort.split(":");
                host = group[0];
                port = Integer.parseInt(group[1]);
            } else {
                host = hostAndPort;
                port = allKonwnPorts.get(schema);
            }
            System.out.println(host);
            System.out.println(port);
        }

        // 找 path
        URL = URL.substring(i);
        i = URL.indexOf("?");
        String path;
        if (i != -1) {
            path = URL.substring(0, i);
        } else {
            path = URL;
        }
        System.out.println(path);

        // 区分 query_string 和 segment
        if (i != -1) {
            String queryString;
            URL = URL.substring(i + 1);
            String[] group = URL.split("#");
            queryString = group[0];
            if (group.length == 2) {
                System.out.println(group[1]);
            }

            String[] kvGroup =queryString.split("&");
            for (String kv : kvGroup) {
                int index = kv.indexOf("=");
                String key = URLDecoder.decode(kv.substring(0, index), "UTF-8");
                String value = URLDecoder.decode(kv.substring(index + 1), "UTF-8");
                System.out.println(key);
                System.out.println(value);
                System.out.println("===================");
            }
        }
    }
}
/**
 * 执行结果：
 https
 www.baidu.com
 443
 /s
 wd
 c++
 ===================
 rsv_spt
 1
 ===================
 rsv_iqid
 0xd0f847e600c86e8a
 ===================
 issp
 1
 ===================
 f
 8
 ===================
 rsv_bp
 1
 ===================
 rsv_idx
 2
 ===================
 ie
 utf-8
 ===================
 tn
 78000241_21_hao_pg
 ===================
 rsv_enter
 0
 ===================
 rsv_dl
 tb
 ===================
 rsv_sug3
 3
 ===================
 rsv_sug1
 3
 ===================
 rsv_sug7
 100
 ===================
 prefixsug
 c%2B%2B
 ===================
 rsp
 0
 ===================
 inputT
 3832
 ===================
 rsv_sug4
 3833
 ===================
*/