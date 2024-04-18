import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Session3 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body>");

HttpSession session=request.getSession();
String user=(String)session.getAttribute("uid");
String password=(String)session.getAttribute("pwd");

out.println("Hello"+user+"<br>");
out.println("Your password is:"+password+"<br>");

out.println("<form action='Session4'>");
out.println("<input type='Submit' value='Submit'><br>");

out.println("</form>");
out.println("<body>");
out.println("<html>");

}
}

