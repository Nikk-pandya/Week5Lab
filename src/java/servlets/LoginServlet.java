
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.user;
import models.AccountService;

/**
 *
 * @author 829364
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();
   
        
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response); 
        

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
       
   String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.equals("") || password == null || password.equals("")) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
           
            
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                    .forward(request, response);
            return;
        }
        
        else if (username.equals("abe") || username.equals("barb") && password.equals("password")){
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
        
       
        
        
          getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

    

}
