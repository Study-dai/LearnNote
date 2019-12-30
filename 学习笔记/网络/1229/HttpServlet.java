import pachage1228.Request;

import javax.xml.ws.Response;

public abstract class HttpServlet {
    public abstract void doGet(Request req, Response resp);
}
