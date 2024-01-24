import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Radio1 extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<form action='Radio2'>");

        out.println("First No: <input type='text' name='fno'><br>");        
        out.println("Second No: <input type='text' name='sno'><br>");        
        out.println("Choose Operation");
        out.println("<input type='radio' name='oper' value='sum'>Summation");
        out.println("<input type='radio' name='oper' value='sub'>Subtraction");
        out.println("<input type='radio' name='oper' value='mult'>Multiplication");
        out.println("<input type='radio' name='oper' value='div'>Division<br>");

        out.println("<input type='submit' value='Submit'>");

        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

}
