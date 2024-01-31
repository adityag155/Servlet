import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AddProduct extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<form action='Cost'>");

        out.println("Product Name: <input type='text' name='prname'><br>");
        out.println("Price: <input type='text' name='price'><br>");
        out.println("Quantity: <input type='text' name='qty'><br>");
        out.println("<input type='submit' value='Submit'>");

        out.println("</form>");


        out.println("</body>");
        out.println("</html>");
    }

}
