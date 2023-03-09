import javax.imageio.IIOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet("/zenith")
public class brewHelloWorldServlet extends HttpServlet {
    private int counter = 0;
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
//        PrintWriter hw = response.getWriter();
        out.println("<html><head><title>Page View Counter</title></head><body>");

        String name = request.getParameter("name");
        if ( name == null){
            out.println("<h1>Hello World</h1>");
        } else {
            out.println("hello " + name + "!");
        }

        // Bonus: Check if reset parameter exists in query string
        String reset = request.getParameter("reset");
        if (reset != null && reset.equals("true")) {
            counter = 0;
            out.println("<h1>Counter has been reset</h1>");
        } else {
            counter++;
            out.println("<h1>Page Views: " + counter + "</h1>");
        }

        out.println("</body></html>");
    }

}
