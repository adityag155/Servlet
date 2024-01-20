import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TableEx extends HttpServlet
{

public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body bgcolor='blue'>");

out.println("<h1>Heading tag used here</h1>");
out.println("<table border='1'>");

out.println("<tr>");
out.println("<th>Roll No.</th>");
out.println("<th>Name</th>");
out.println("<th>City</th>");
out.println("</tr>");

out.println("<tr>");
out.println("<td>1</td>");
out.println("<td>ABC</td>");
out.println("<td>Pune</td>");
out.println("</tr>");

out.println("<tr>");
out.println("<td>2</td>");
out.println("<td>PQR</td>");
out.println("<td>Mumbai</td>");
out.println("</tr>");

out.println("<tr>");
out.println("<td>3</td>");
out.println("<td>XYZ</td>");
out.println("<td>Delhi</td>");
out.println("</tr>");

out.println("</table>");
out.println("</body>");
out.println("</html>");
}
}
