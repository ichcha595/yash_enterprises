import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class dislogin extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        PrintWriter out=response.getWriter();
       out.print("<html>");
       out.print("<head>");
       
       out.print("</head>");
       out.print("<body>");
       
        String s1=request.getParameter("name");
        String s2=request.getParameter("password");
        
       out.print("<center>");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yash?useSSL=false","root","root");
            Statement st=con.createStatement();
            String s11="select * from distributer where name='"+s1+"' AND password='"+s2+"'";
            ResultSet rs=st.executeQuery(s11);
            if(rs.next())
            {
                response.sendRedirect("Menu1.html");
            }
           
            else 
            {
            out.println("invalid user name & password");
            }
        
            con.close();
        }
        
        catch(Exception e){
            
         out.print(e);   
        }
        out.close();
        out.print("</center>");
        out.print("</body>");
        out.print("</html>");
        
      }
      }
    