package fory.httpmock;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DyeHttpServer extends HttpServlet{

    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("success");
        response.setStatus(HttpServletResponse.SC_OK);
    }

}
