import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessingGame", urlPatterns = "/guess")
public class GuessingGameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("guessing.jsp");
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guess = Integer.parseInt(request.getParameter("guess"));
        if (guess == 2) {
            response.sendRedirect("correct");
        } else if (guess >= 1 && guess <= 3) {
            response.sendRedirect("incorrect");
        } else {
            response.sendRedirect("guess");
        }
    }

    }

