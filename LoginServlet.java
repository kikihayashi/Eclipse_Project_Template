package practice2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//也可在web.xml設定initParams
@WebServlet(
		name = "LoginServlet" ,
		urlPatterns = {"/p2/login.asp"},
		initParams = @javax.servlet.annotation.WebInitParam
		(name = "name", value = "alan2"))
public class LoginServlet extends HttpServlet {
	   
	@Override	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
	{	
			
		String secretName = getInitParameter("name");//取得預設值name = "name", value = "alan2"
		System.out.println(secretName);
		
		System.out.println(this.getServletName());
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		String id = req.getParameter("UserName");
		String password = req.getParameter("UserPWD");

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>作業一測試</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>帳號："+id+"</h1>");
		out.println("<br>");
		out.println("<h1>密碼："+password+"</h1>");
		out.println("</body>");
		out.println("</html>");

		out.close();

	}
}
