import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
 
 
 


public class SessionTracking2 extends HttpServlet {
        private static final long serialVersionUID = 1L;
 
    public SessionTracking2() {
        super();
        // TODO Auto-generated constructor stub
    }
 
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            String userId = request.getParameter("userid");
            if (userId == null ) {
                out.println("No UserId was found in the URL.<br>");
            } else {
                out.println("UserId obtained from URL Rewriting:" + userId + "<br>");
            }
            out.println("</body></html>");
 
        }
 
        
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }
 
}
