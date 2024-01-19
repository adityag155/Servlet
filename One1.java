import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class One1 extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<form action='Two2'>");
        out.println("First No: <input type='text' name='fno'><br>");        
        out.println("Second No: <input type='text' name='sno'><br>");        
        out.println("<input type='submit' value='SUM'>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

}




