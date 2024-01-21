import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Info2 extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, 
ServletException


{

response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body>");

out.println("<h1>Thank You!!</h1>");

out.println("</body>");
out.println("</html>");

}
}