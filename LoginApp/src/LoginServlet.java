

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
        String uname = request.getParameter("uname");
 
        String pwd = request.getParameter("pass")   ;
    if(uname.equals(pwd)){
    	out.println("<center><h1>welcome to our webiste</h1></center>");
    }
    
    	else{
    		out.println("Invalid usetname and password.please try again");
    		RequestDispatcher rd = request.getRequestDispatcher("/login.html");
    		rd.forward(request, response);
    	}
    }
    
	}


