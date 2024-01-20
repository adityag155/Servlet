import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class FormEx extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body>");

out.println("<form action='1'>");
out.println("First Name:<input type='text'name='fname'><br>");


out.println("Last Name:<input type='text' name='lname'><br>");

out.println("Gender:Male<input type='radio' name='gender'><br>Female<input type='radio' name='gender'><br>");

out.println("<input type='Submit'name='button'>");
out.println("</form>");

out.println("</body>");
out.println("</html>");
}
}
