import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MakeTable extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();;

out.println("<html>");
out.println("<body>");

out.println("<Form action='MakeTable2'method='post'>");
out.println("First Number:<input type='text'><br>");
out.println("second Number:<input type='text'><br>");
out.println("<input type='submit'name='table'value='Generate Table'>");

out.println("</body>");
out.println("</html>");
}
}