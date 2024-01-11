import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class DELETE extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
       
        String s1=request.getParameter("name");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///yash?useSSL=false","root","root");
            Statement st=con.createStatement();
            String s11="delete from order_table where name='"+s1+"'";
            
            st.executeUpdate(s11);
            out.print("Data deleted");
            con.close();
       
        }
        catch(Exception e)
        {
            out.print(e);
        }
        out.close();
    }
}
             
             