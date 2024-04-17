import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session2 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body>");

String uname=request.getParameter("uname");
String pass=request.getParameter("pass");

HttpSession session=request.getSession();
session.setAttribute("uid", uname);
session.setAttribute("pwd",pass);

out.println("<form action='Session3'>");
out.println("<input type='Submit' value='Submit'><br>");
out.println("</form>");

out.println("</body>");
out.println("</html>");
}
}