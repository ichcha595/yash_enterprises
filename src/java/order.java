import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class order extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
        PrintWriter out=response.getWriter();
        
        String s1=request.getParameter("name");
        String s2=request.getParameter("date");
        String s3=request.getParameter("WB");
        String s4=request.getParameter("BB");
        String s5=request.getParameter("Atta");
        String s6=request.getParameter("MB");
        String s7=request.getParameter("SB");
        String s8=request.getParameter("SR");
        String s9=request.getParameter("TR");
        String s10=request.getParameter("BR");
        String s11=request.getParameter("BC");
        String s12=request.getParameter("CC");
        String s13=request.getParameter("MFC");
        String s14=request.getParameter("JC");
        String s15=request.getParameter("AC");
       
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///yash?useSSL=false","root","root");
            Statement st=con.createStatement();
            
            String s16="insert into order_table values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"','"+s14+"','"+s15+"')";
            st.executeUpdate(s16);
            out.print("data insert");
           
            con.close();
        }
        catch(Exception e){
            
         out.print(e);   
        }
            
     out.close();
        }
        }
    