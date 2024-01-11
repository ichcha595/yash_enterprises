import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class disreg extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        PrintWriter out=response.getWriter();
        String s1=request.getParameter("name");
        String s2=request.getParameter("password");
        String s3=request.getParameter("email");
        String s4=request.getParameter("DOB");
        String s5=request.getParameter("contactnumber");
        String s6=request.getParameter("experience");
        String s7=request.getParameter("oldcomapanyname");
        
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///yash?useSSL=false","root","root");
            Statement st=con.createStatement();
            String s11="insert into distributer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
            st.executeUpdate(s11);
            out.print("data insert");
           response.sendRedirect("dislogin.html");
            con.close();
        }
        catch(Exception e){
            
         out.print(e);   
        }
            
     out.close();
        }
        }
    