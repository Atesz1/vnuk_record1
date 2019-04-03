package vn.edu.vnuk.record.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Studies extends HttpServlet{
	@Override
	protected void service (HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>My Studies</title>");
		
		out.println("<style>");
		out.println("table {\r\n" + 
				"  border-collapse: collapse;\r\n" + 
				"  width: 100%;\r\n" + 
				"}");
		out.println("td,th{\r\n" + 
				"  border: 1px solid #000;\r\n" + 
				"  text-align: left;\r\n" + 
				"  padding: 8px;\r\n" + 
				"}");
		out.println("th{\r\n" + 
				"  text-align: center;\r\n" + 
				"  background-color: #ccf5ff;\r\n" + 
				"}");

		out.println("</style>");
		
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h1>My Studies</h1>");
		
		out.println("<table>");
		
		out.println("<thead>");
		out.println("<tr>");
		out.println("<tr>");
		out.println("<th> Year </th>");		
		out.println("<th> School </th>");	
		out.println("<th> Town </th>");
		out.println("<th> Country </th>");
		out.println("</tr>");		
		out.println("</tr>");
		out.println("</thead>");
		
		out.println("<tbody>");
				
		out.println("<tr>");
		out.println("<td> 2018- IT </td>");		
		out.println("<td> VNUK University </td>");	
		out.println("<td > Da Nang </td>");
		out.println("<td rowspan = \"5\"> Vietnam </td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td> 2018- Cybersec </td>");		
		out.println("<td> 	Óbuda University </td>");	
		out.println("<td rowspan = \"2\" > Budapest </td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td> 2009-2015 </td>");		
		out.println("<td> Károli Gáspár University </td>");	
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td> 2004-2008 </td>");		
		out.println("<td> Rózsa Ferenc High School </td>");	
		out.println("<td rowspan = \"2\" > Békéscsaba </td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td> 1996-2004 </td>");		
		out.println("<td> Number 2 Primary School </td>");	
		out.println("</tr>");
		
		out.println("</tbody>");
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}