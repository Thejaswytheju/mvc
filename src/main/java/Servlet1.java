import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
       PrintWriter out = response.getWriter();
       String d1=Integer.toString((int)((Math.random()*6)+1));
       String d2=Integer.toString((int)((Math.random()*6)+1));
       out.println("<html> <body>" + "<h1 align centre> Roller </h1>"+
       "<p>" +d1 +"and" +d2+ "are rolled" +"</p>" + "</body> </html>");

   }
}
