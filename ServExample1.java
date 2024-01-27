import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServExample1 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body bgcolor='red'>");
	  

out.println("<Form action='FormEx2'>");

out.println("First Name:<input type='text'><br>");
out.println("Last Name:<input type='text'><br>");

out.println("<input type='Submit'>");


out.println("</body>");
out.println("</html>");

}
}