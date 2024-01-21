import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Color extends HttpServlet
{

public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body bgcolor='pink'>");


out.println("<p>color tag used here</p><br>");
out.println("<h3>Heading tag used here</h3><br>");
out.println("<b>bold tag used here</b><br>");
out.println("<i>italics tag used here</i><br>");
out.println("<u>underline tag used here</u><br>");
out.println("<div><p>hello, how are you, here we used <span style='color:blue'>SPAN TAG</span></p></div><br>");

out.println("</body>");
out.println("</html>");
}
}
