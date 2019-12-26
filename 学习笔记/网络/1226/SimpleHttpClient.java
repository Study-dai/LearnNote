package package1226;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SimpleHttpClient {
    // GET http://www.baidu.com/ 1.0
    // GET 方法是不带 request body
    public static void main(String[] args) throws IOException {
        StringBuilder request = new StringBuilder();
        request.append("GET / HTTP/1.0\r\n");
        request.append("Host: www.baidu.com\r\n");
        request.append("\r\n");
        System.out.println(request.toString());

        Socket socket = new Socket("www.baidu.com", 80);
        socket.getOutputStream().write(request.toString().getBytes("UTF-8"));
        socket.getOutputStream().flush();
        socket.shutdownOutput();

        // 1. 解析响应
        // 2. 把 响应体 保存到一个文件 百度.html
        byte[] buffer = new byte[4096];
        int len = socket.getInputStream().read(buffer);
        String response = new String(buffer, 0, len, "UTF-8");
        System.out.println(response);
        System.exit(0);


        // 假设已经把 状态行 + 所有状态头 + 空行都读到了
        int index = -1;
        for (int i = 0; i < len - 3; i++) {
            if (buffer[i] == '\r' && buffer[i + 1] == '\n' && buffer[i + 2] == '\r' && buffer[i + 3] == '\n') {
                index = i;
                break;
            }
        }
        //System.out.println(index);
        int 已经读到的正文的长度 = len - index - 4;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer, 0, index + 4);
        Scanner scanner = new Scanner(byteArrayInputStream, "UTF-8");

        String statusLine = scanner.nextLine();
        System.out.println("状态行: " + statusLine);
        String line;
        int contentLength = -1;
        while (!(line = scanner.nextLine()).isEmpty()) {
            String[] kv = line.split(":");
            String key = kv[0].trim();
            String value = kv[1].trim();
            System.out.println("响应头: " + key + " = " + value);
            if (key.equalsIgnoreCase("Content-Length")) {
                contentLength = Integer.parseInt(value);
            }
        }

        int 还需要读的正文的长度 = contentLength - 已经读到的正文的长度;

        byte[] body = new byte[contentLength];
        System.arraycopy(
                buffer,
                index + 4,
                body,
                0,
                已经读到的正文的长度
        );

        int 实际又读到的长度 = socket.getInputStream().read(
                body, 已经读到的正文的长度, 还需要读的正文的长度
        );
        System.out.println(contentLength);
        System.out.println(已经读到的正文的长度);
        System.out.println(还需要读的正文的长度);
        System.out.println(实际又读到的长度);

        FileOutputStream os = new FileOutputStream("百度.html");
        os.write(body);
        os.close();
    }
}
/**
 * 执行结果：
 GET / HTTP/1.0
 Host: www.baidu.com


 HTTP/1.0 200 OK
 Accept-Ranges: bytes
 Cache-Control: no-cache
 Content-Length: 14615
 Content-Type: text/html
 Date: Thu, 26 Dec 2019 06:44:42 GMT
 P3p: CP=" OTI DSP COR IVA OUR IND COM "
 P3p: CP=" OTI DSP COR IVA OUR IND COM "
 Pragma: no-cache
 Server: BWS/1.1
 Set-Cookie: BAIDUID=93138C11EF4522E64CB4082D368BE498:FG=1; expires=Thu, 31-Dec-37 23:55:55 GMT; max-age=2147483647; path=/; domain=.baidu.com
 Set-Cookie: BIDUPSID=93138C11EF4522E64CB4082D368BE498; expires=Thu, 31-Dec-37 23:55:55 GMT; max-age=2147483647; path=/; domain=.baidu.com
 Set-Cookie: PSTM=1577342682; expires=Thu, 31-Dec-37 23:55:55 GMT; max-age=2147483647; path=/; domain=.baidu.com
 Set-Cookie: BAIDUID=93138C11EF4522E644ABB3687D2F34D7:FG=1; max-age=31536000; expires=Fri, 25-Dec-20 06:44:42 GMT; domain=.baidu.com; path=/; version=1; comment=bd
 Traceid: 157734268227878940267959298565933770408
 Vary: Accept-Encoding
 X-Ua-Compatible: IE=Edge,chrome=1

 <!DOCTYPE html><!--STATUS OK-->
 <html>
 <head>
 <meta http-equiv="content-type" content="text/html;charset=utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=Edge">
 <link rel="dns-prefetch" href="//s1.bdstatic.com"/>
 <link rel="dns-prefetch" href="//t1.baidu.com"/>
 <link rel="dns-prefetch" href="//t2.baidu.com"/>
 <link rel="dns-prefetch" href="//t3.baidu.com"/>
 <link rel="dns-prefetch" href="//t10.baidu.com"/>
 <link rel="dns-prefetch" href="//t11.baidu.com"/>
 <link rel="dns-prefetch" href="//t12.baidu.com"/>
 <link rel="dns-prefetch" href="//b1.bdstatic.com"/>
 <title>百度一下，你就知道</title>
 <link href="http://s1.bdstatic.com/r/www/cache/static/home/css/index.css" rel="stylesheet" type="text/css" />
 <!--[if lte IE 8]><style index="index" >#content{height:480px\9}#m{top:260px\9}</style><![endif]-->
 <!--[if IE 8]><style index="index" >#u1 a.mnav,#u1 a.mnav:visited{font-family:simsun}</style><![endif]-->
 <script>var hashMatch = document.location.href.match(/#+(.*wd=[^&].+)/);if (hashMatch && hashMatch[0] && hashMatch[1]) {document.location.replace("http://"+location.host+"/s?"+hashMatch[1]);}var ns_c = function(){};</script>
 <script>function h(obj){obj.style.behavior='url(#default#homepage)';var a = obj.setHomePage('//www.baidu.com/');}</script>
 <noscript><meta http-equiv="refresh" content="0; url=/baidu.html?from=noscript"/></noscript>
 <script>window._ASYNC_START=new Date().getTime();</script>
 </head>
 <body link="#0000cc"><div id="wrapper" style="display:none;"><div id="u"><a href="//www.baidu.com/gaoji/preferences.html"  onmousedown="return user_c({'fm':'set','tab':'setting','login':'0'})">搜索设置</a>|<a id="btop" href="/"  onmousedown="return user_c({'fm':'set','tab':'index','login':'0'})">百度首页</a>|<a id="lb" href="https://passport.baidu.com/v2/?login&tpl=mn&u=http%3A%2F%2Fwww.baidu.com%2F" onclick="return false;"  onmousedown="return user_c({'fm':'set','tab':'login'})">登录</a><a href="https://passport.baidu.com/v2/?reg&regType=1&tpl=mn&u=http%3A%2F%2Fwww.baidu.com%2F"  onmousedown="return user_c({'fm':'set','tab':'reg'})" target="_blank" class="reg">注册</a></div><div id="head"><div class="s_nav"><a href="/" class="s_logo" onmousedown="return c({'fm':'tab','tab':'logo'})"><img src="//www.baidu.com/img/baidu_jgylogo3.gif" width="117" height="38" border="0" alt="到百度首页" title="到百度首页"></a><div class="s_tab" id="s_tab"><a href="http://news.baidu.com/ns?cl=2&rn=20&tn=news&word=" wdfield="word"  onmousedown="return c({'fm':'tab','tab':'news'})">新闻</a>&#12288;<b>网页</b>&#12288;<a href="http://tieba.baidu.com/f?kw=&fr=wwwt" wdfield="kw"  onmousedown="return c({'fm':'tab','tab':'tieba'})">贴吧</a>&#12288;<a href="http://zhidao.baidu.com/q?ct=17&pn=0&tn=ikaslist&rn=10&word=&fr=wwwt" wdfield="word"  onmousedown="return c({'fm':'tab','tab':'zhidao'})">知道</a>&#12288;<a href="http://music.baidu.com/search?fr=ps&key=" wdfield="key"  onmousedown="return c({'fm':'tab','tab':'music'})">音乐</a>&#12288;<a href="http://image.baidu.com/i?tn=baiduimage&ps=1&ct=201326592&lm=-1&cl=2&nc=1&word=" wdfiel
*/