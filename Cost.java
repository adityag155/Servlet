import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Cost extends HttpServlet 
{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");

        String prname=request.getParameter("prname");
        int price=Integer.parseInt(request.getParameter("price"));
        int qty=Integer.parseInt(request.getParameter("qty"));
        int total=price*qty;

        Product p=new Product();
        p.prname=prname;
        p.price=price;
        p.qty=qty;
        p.total=total;

        HttpSession session=request.getSession();

        Vector<Product> v;       
        v=(Vector<Product>)session.getAttribute("cost");

        if(v==null)
                 v=new Vector();

        v.add(p);                 
        session.setAttribute("cost", v);

        out.println("<table border='1' align='center'>");
        out.println("<tr>");
        out.println("<th>Product Name</th>");
        out.println("<th>Price</th>");
        out.println("<th>Qty</th>");
        out.println("<th>Total</th>");
        out.println("</tr>");

        int grandTotal=0;

        for(Product pr:v)
          {
           out.println("<tr>");
           out.println("<td>" + pr.prname + "</td>");
           out.println("<td>" + pr.price + "</td>");
           out.println("<td>" + pr.qty + "</td>");
           out.println("<td>" + pr.total + "</td>");
           out.println("</tr>");          

           grandTotal=grandTotal + pr.total;        
          }  

           out.println("<tr>");
           out.println("<th colspan='4'>Grand Total=" + grandTotal + "</th>");
           out.println("</tr>");          

        out.println("</table>");

        out.println("<br><center><a href='AddProduct'>Add New Product</a></center>");

        out.println("</body>");
        out.println("</html>");
    }

}




