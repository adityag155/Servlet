import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Radio2 extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("<html>");
out.println("<body>");

int fno=Integer.parseInt(request.getParameter("fno"));
int sno=Integer.parseInt(request.getParameter("sno"));

String oper=request.getParameter("oper");
int res=0;

if(oper.equals("sum"))
{
res=fno+sno;
out.println("Result="+res);
}
else if(oper.equals("sub"))
{
res=fno-sno;
out.println("Result="+res);
}
else if(oper.equals("mul"))
{
res=fno*sno;
out.println("Result="+res);
}
else if(oper.equals("div"))
{
res=fno/sno;
out.println("Result="+res);
}

out.println("</body>");
out.println("</html>");
}
}