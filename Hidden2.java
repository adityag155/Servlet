import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Hidden2 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

String uname1=request.getParameter("uname1");

out.println("<html>");
out.println("<body bgcolor='pink'><br><br><br>");

out.println("<form action='Hidden3'>");

out.println("Name: "+uname1);
out.println("<input type='hidden'name='uname2'value='"+uname1+"'><br>");

out.println("<input type='submit'value='Submit'>");

out.println("</form>");
out.println("</body>");
out.println("</html>");

}
}

