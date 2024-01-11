import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class UPDATE extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
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
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///yash?useSSL=false","root","root");
            Statement st=con.createStatement();
            String s16="update order_table set date='"+s2+"',WB='"+s3+"',BB='"+s4+"',Atta='"+s5+"',MB='"+s6+"',SB='"+s7+"',SR='"+s8+"',TR='"+s9+"',BR='"+s10+"',BC='"+s11+"',CC='"+s12+"',MFC='"+s13+"',JC='"+s14+"',AC='"+s15+"'where name='"+s1+"'";
            int x=st.executeUpdate(s16);
            response.sendRedirect("SHOWALL");
            con.close();
       
        }
        catch(Exception e)
        {
            out.print(e);
        }
        out.close();
    }
}
             
             