import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MakeTable2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        // Retrieve parameters from the form
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        
        out.println("<table border='2'>");
        

        for (int i =1; i <= 10; i++) {
            out.println("<tr>");
            for (int j =num1; j <=num2; j++) {
                
                out.println("<td>");
		out.println(i*j);
            }
out.println("</td>");
out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
