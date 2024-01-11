import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class CUSTOMER extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<link rel='stylesheet'href='abc.css'/>");
        out.print("</head>");
        out.print("<body>");
        out.print("<center>");
        out.print("<ul>");
        
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///yash?useSSL=false","root","root");
            Statement st=con.createStatement();
            String s16="select * from customer";
            ResultSet rs=st.executeQuery(s16);
            out.print("<table cellpadding ='10'>");
            
            out.println("<tr>");
            out.print("<td>NAME</td>");
            out.print("<td>PASS</td>");
            out.print("<td>CONTACT_NUMBER</td>");
            out.print("<td>SHOPNAME</td>");
            out.print("<td>SHOPADDRESS</td>");
            
            
            
            out.print("</tr>");
            while(rs.next())
            {
                out.print("<tr>");
                out.print("<td>"+rs.getString(1)+"</td>");
                out.print("<td>"+rs.getString(2)+"</td>");
                out.print("<td>"+rs.getString(3)+"</td>");
                out.print("<td>"+rs.getString(4)+"</td>");
                out.print("<td>"+rs.getString(5)+"</td>");
               
                out.print("</tr>");
            }
           
            out.print("</table>");
            con.close();              
            }
        catch(Exception e)
        {
            out.print(e);
        }
        out.close();
        out.print("</center>");
        out.print("</body>");
        out.print("</html>");
    }
}
