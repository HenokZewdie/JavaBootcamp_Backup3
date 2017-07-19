import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddSerlets")
public class AddSerlets extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
			
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			int k = Integer.parseInt(req.getParameter("num3"));
			int t = Integer.parseInt(req.getParameter("num4"));
			int total = i+j+k+t;
			PrintWriter out = res.getWriter();
			out.println(k);
			out.println(t);
			out.println(j);
			
			out.println(req.getParameter("num4"));
			
			//out.println(k + i +j+ t);
			//out.println(total);
			
			
			
		}
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
			String fnames = req.getParameter("FName");
			String lnames = req.getParameter("LName");
			String skills = req.getParameter("skill");
						
				PrintWriter out = res.getWriter();
				out.println(fnames + "\t" + lnames + "\t" + skills);
			//processRequest(req,res);
		}
		public void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
		
			//System.out.println(total);
		}
}
