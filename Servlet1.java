import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet1 extends HttpServlet
{
 
  public void doGet(HttpServletRequest request,HttpServletResponse response) throws   IOException,ServletException
 
 {
   response.setContentType("text/html");
   PrintWriter out = response.getWriter();
 
   out.println("<html>");
   out.println("<body>");
   out.println("CPC Academy Pune");
   out.println("</body>");
   out.println("</html>");


 } 

}