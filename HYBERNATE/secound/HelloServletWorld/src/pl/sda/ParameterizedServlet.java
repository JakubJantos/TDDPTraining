package pl.sda;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map.Entry;
import java.io.PrintWriter;

public class ParameterizedServlet extends HttpServlet {
  /* protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   }*/

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        request.getParameterMap().entrySet().stream()
                .forEach(o -> {
                    Entry e = (Entry) o;
                    pw.println(e.getKey());
                });
    }
}