import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MakeTable2 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();

out.println("<html>");
out.println("<body>");

        // Retrieve parameters from the form
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));

out.println("<h2>Multiplication Table for " + num1 + " to " + num2 + "</h2>");
out.println("<table border='1'>");
out.println("<tr><th>Multiplicand</th><th>Multiplier</th><th>Product</th></tr>");

for (int i = num1; i <= num2; i++) {
out.println("<tr>");
for (int j = 1; j <= 10; j++) {
out.println("<td>" + i + "</td>");
out.println("<td>" + j + "</td>");
out.println("<td>" + (i * j) + "</td>");
out.println("</tr>");
}
}

out.println("</table>");
out.println("</body>");
out.println("</html>");
}
}