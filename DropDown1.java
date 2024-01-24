import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DropDown1 extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        out.println("<form action='DropDown2'>");

        out.println("First No: <input type='text' name='fno'><br>");        
        out.println("Second No: <input type='text' name='sno'><br>");        
        out.println("Choose Operation");
        out.println("<select name='oper'>");
        out.println("<option value='sum'>Summation</option>");
        out.println("<option value='sub'>Subtraction</option>");
        out.println("<option value='mult'>Multiplication</option>");
        out.println("<option value='div'>Division</option>");
        out.println("</select><br>");

        out.println("<input type='submit' value='Submit'>");

        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

}



