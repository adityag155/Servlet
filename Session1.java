import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session1 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html"); 
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body>");

out.println("<form action='Session2'>");

out.println("Name:<input type='text' name='uname'><br>");
out.println("Password:<input type='password' name='pass'><br>");

out.println("<input type='submit' value='Submit'><br>");
out.println("</form>");

out.println("</body>");
out.println("</html>");
}
}
