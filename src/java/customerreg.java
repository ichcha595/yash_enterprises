import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class customerreg extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        PrintWriter out=response.getWriter();
        String s1=request.getParameter("name");
        String s2=request.getParameter("password");
        String s3=request.getParameter("contactnumber");
        String s4=request.getParameter("shopname");
        String s5=request.getParameter("shopaddress");
      
        
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///yash?useSSL=false","root","root");
            Statement st=con.createStatement();
            String s11="insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
            st.executeUpdate(s11);
            out.print("data insert");
            response.sendRedirect("customerlogin.html");
            con.close();
        }
        catch(Exception e){
            
         out.print(e);   
        }
            
     out.close();
        }
        }
    