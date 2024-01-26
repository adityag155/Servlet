import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Hidden1 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body>");

out.println("<form action='Hidden2'>");

out.println("Name: ");
out.println("<input type='text'name='uname1'><br>");

out.println("<input type='submit'value='Submit'>");

out.println("</form>");

out.println("</body>");
out.println("</html>");
}
}