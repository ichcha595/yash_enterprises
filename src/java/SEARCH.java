import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class SEARCH extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out=response.getWriter();
       
        String s1=request.getParameter("name");
        out.print("<html>");
        out.print("<head>");
        out.print("<link rel='stylesheet'href='abc.css'/>");
        out.print("</head>");
        out.print("<body>");
        out.print("<center>");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///yash?useSSL=false","root","root");
            Statement st=con.createStatement();
            String s16="select * from order_table where name='"+s1+"'";
            
            ResultSet rs=st.executeQuery(s16);
            
            if(rs.next())
            {
                
            out.print("<form action='UPDATE'>");
            
            
            out.print("<h1>YASH ENTERPRSISES</h1>");
            out.print("name");
             out.print("<input type='text'name='name'value='"+rs.getString(1)+"'><BR><Br>");
             
             
         
             out.print("date");
             out.print("<input type='text'name='date'value='"+rs.getString(2)+"'><BR><BR>");
             
             
             
             
             out.print("WB");
             out.print("<input type='text'name='WB'value='"+rs.getString(3)+"'><BR><BR>");
             
         
             out.print("BB");
             out.print("<input type='text'name='BB'value='"+rs.getString(4)+"'><BR><BR>");
            
             
             
            
             out.print("Atta");
             out.print("<input type='text'name='Atta'value='"+rs.getString(5)+"'><BR><BR>");
           
           
            out.print("MB");
             out.print("<input type='text'name='MB'value='"+rs.getString(6)+"'><BR><BR>");
            
             out.print("SB");
             out.print("<input type='text'name='SB'value='"+rs.getString(7)+"'><BR><BR>");
                               
             out.print("SR");
             out.print("<input type='text'name='SR'value='"+rs.getString(8)+"'><BR><BR>");
             
             
             
             out.print("TR");
             out.print("<input type='text'name='TR'value='"+rs.getString(9)+"'><BR><BR>");
             
             
             
             
             out.print("BR");
             out.print("<input type='text'name='BR'value='"+rs.getString(10)+"'><BR><BR>");
             
             
             
            out.print("BC");
             out.print("<input type='text'name='BC'value='"+rs.getString(11)+"'><BR><BR>");
             
             
             
             out.print("CC");
             out.print("<input type='text'name='CC'value='"+rs.getString(12)+"'><BR><BR>");
             
             
             
             
             out.print("MFC");
             out.print("<input type='text'name='MFC'value='"+rs.getString(13)+"'><BR><BR>");
             
             
             
            
             out.print("JC");
             out.print("<input type='text'name='JC'value='"+rs.getString(14)+"'><BR><BR>");
             
         
             out.print("AC");
             out.print("<input type='text'name='AC'value='"+rs.getString(15)+"'><BR><BR>");
             
        
             out.print("<input type='submit'class='B'value='update'>");
             
          
             out.print("</form>");
            
            }
            else
            {
                out.print("invalid name");
            }
            con.close();
        }catch(Exception e)
        {
            out.print(e);
        }
        out.close();
        out.print("</center>");
        out.print("/body");
        out.print("</html>");
    }
}
           
