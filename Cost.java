import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Cost extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
	out.println("<body>");
        out.println("<table border='1'>");
        out.println("<tr>");
	out.println("<th>Product Name</th>");
	out.println("<th>Price</th>");
	out.println("<th>Quantity</th>");
	out.println("<th>Total</th>");
	out.println("</tr>");	 

        String productname = request.getParameter("productname");
        int price = Integer.parseInt(request.getParameter("price"));
        int qty = Integer.parseInt(request.getParameter("qty"));
        int total = price * qty; 

       
        out.println("<tr>");
        out.println("<td>" + productname + "</td>");
        out.println("<td>" + price + "</td>");
        out.println("<td>" + qty + "</td>");
        out.println("<td>" + total + "</td>");
        out.println("</tr>");

        out.println("</table>");
	out.println("</body>");
	out.println("</html>");
    }
}
