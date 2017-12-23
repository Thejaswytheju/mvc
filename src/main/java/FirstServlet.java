
import java.io.*;
import java.sql.CallableStatement;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import static javax.swing.UIManager.getString;


public class FirstServlet extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      response.setContentType("text/html;charset=UTF-8");

      PrintWriter out = response.getWriter();


            try {
         out.println("<!DOCTYPE html");  // HTML 5
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         String title = "Servlet Title chennai";
         out.println("<head><title>" + title + "</title></head>");
         out.println("<body>");
         out.println("<h3>" + title + "</h3>");

         // Tabulate the request information
         out.println("<table>");
         out.println("<tr><td>" + getString("requestinfo.label.protocol") + "</td>");
         out.println("<td>" + request.getProtocol() + "</td></tr>");
               out.println("<tr><td>" + getString("requestinfo.label.method") + "</td>");
         out.println("<td>" + request.getMethod() + "</td></tr>");
         out.println("</td></tr><tr><td>");
         out.println("<tr><td>" + getString("requestinfo.label.requesturi") + "</td>");
         out.println("<td>" + HtmlFilter.filter(request.getRequestURI()) + "</td></tr>");
         out.println("<tr><td>" + getString("requestinfo.label.pathinfo") + "</td>");
         out.println("<td>" + HtmlFilter.filter(request.getPathInfo()) + "</td></tr>");
         out.println("<tr><td>Path Translated:</td>");
         out.println("<td>" + request.getPathTranslated() + "</td></tr>");
         out.println("<tr><td>" + getString("requestinfo.label.remoteaddr") + "</td>");
         out.println("<td>" + request.getRemoteAddr() + "</td></tr>");

         // SSL (HTTPS) Cipher suites
         String cipherSuite =  (String)request.getAttribute("javax.servlet.request.cipher_suite");
         if (cipherSuite != null) {
            out.println("<tr><td>SSLCipherSuite:</td>");
            out.println("<td>" + cipherSuite + "</td></tr>");
         }
          out.println("</table></body></html>");
         response.flushBuffer();
      } finally {
         out.close();  // Always close the output writer
      }
   }

   // Do the same thing for GET and POST requests
   @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
      doGet(request, response);
   }
}