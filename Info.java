import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Info extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{

response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body bgcolor='sky blue'>");

out.println("<form action='Info2'>");
out.println("First Name:<input type='text'><br>");
out.println("Last Name:<input type='text'><br>");

out.println("Gender:Male<input type='radio'>Female<input type='radio'><br>");


out.println("<input type='Submit'>");

out.println("</form>");
out.println("</body>");
out.println("</html>");

}
}