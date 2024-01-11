import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class SHOWALL extends HttpServlet
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
            String s16="select * from order_table";
            ResultSet rs=st.executeQuery(s16);
            out.print("<table cellpadding ='10'>");
          out.print  ("<font size='7' align='center'><h1>YASH ENTERPRISES</h1></font>");
            out.println("<tr>");
            out.print("<td>NAME</td>");
            out.print("<td>DATE</td>");
            out.print("<td>WHITE BREAD</td>");
            out.print("<td>BROWN BREAD</td>");
            out.print("<td>ATTA BREAD</td>");
            out.print("<td>MUITIGREEN-BREAD</td>");
            out.print("<td>SANDWICH BREAD</td>");
            out.print("<td>SUJI RUSK</td>");
            out.print("<td>TILI RUSK</td>");
            out.print("<td>BUTTER RUSK</td>");
            out.print("<td>BUTTER COOKIES</td>");
            out.print("<td>COCOUNT COOKIES</td>");
            out.print("<td>MIX FRUIT JAM</td>");
            out.print("<td>JEERA COOKIES</td>");
            out.print("<td>AJWAIN COOKIES</td>");
            
            
            out.print("</tr>");
            while(rs.next())
            {
                out.print("<tr>");
                out.print("<td>"+rs.getString(1)+"</td>");
                out.print("<td>"+rs.getString(2)+"</td>");
                out.print("<td>"+rs.getString(3)+"</td>");
                out.print("<td>"+rs.getString(4)+"</td>");
                out.print("<td>"+rs.getString(5)+"</td>");
                out.print("<td>"+rs.getString(6)+"</td>");
                out.print("<td>"+rs.getString(7)+"</td>");
                out.print("<td>"+rs.getString(8)+"</td>");
                out.print("<td>"+rs.getString(9)+"</td>");
                out.print("<td>"+rs.getString(10)+"</td>");
                out.print("<td>"+rs.getString(11)+"</td>");
                out.print("<td>"+rs.getString(12)+"</td>");
                out.print("<td>"+rs.getString(13)+"</td>");
                out.print("<td>"+rs.getString(14)+"</td>");
                out.print("<td>"+rs.getString(15)+"</td>");
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
