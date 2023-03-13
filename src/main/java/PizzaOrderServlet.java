import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        // Display the form
        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crustType = request.getParameter("crustType");
        String sauceType = request.getParameter("sauceType");
        String sizeType = request.getParameter("sizeType");
        String[] toppings = request.getParameterValues("toppings");
        String deliveryAddress = request.getParameter("deliveryAddress");
        request.setAttribute("crustType",crustType);
        request.setAttribute("sauceType",sauceType);
        request.setAttribute("sizeType",sizeType);
        request.setAttribute("toppings",toppings);
        request.setAttribute("deliveryAddress",deliveryAddress);


        // Output the pizza order details to console
        System.out.println("Pizza Order Details:");
        System.out.println("Crust Type: " + crustType);
        System.out.println("Sauce Type: " + sauceType);
        System.out.println("Size Type: " + sizeType);
        System.out.print("Toppings: ");
        for (String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println();
        System.out.println("Delivery Address: " + deliveryAddress);

        // Forward the request to the pizza order confirmation JSP page
        request.getRequestDispatcher("/pizza-order-confirmation.jsp").forward(request, response);
    }
}
