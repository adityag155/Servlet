import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServletEx extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body bgcolor='pink'>");

out.println("<form action='FormEx2'>");
out.println("First Name<input type='text'>");
out.println("Last Name<input type='text'><br>");
out.println("Mob No:<input type='text'><br>");
out.println("<h1 style='color:red'>List of Courses</h1>");
out.println("<ol>List of Subject");
out.println("<li>Java</li>");
out.println("<li>Python</li>");
out.println("<li>Testing</li>");
out.println("<li>Machine Learning</li>");
out.println("</ol><br>");

out.println("Date of Joining<input type='date'><br>");
out.println("Feedback:<input type='text'><br>");
out.println("<input type='Submit'>");

out.println("</form>");
out.println("</body>");
out.println("</html>");




























}
}
