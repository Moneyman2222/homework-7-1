package Main;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainJava extends Main{

/** Process the HTTP Post request */
public void doGet(HttpRequest request, HttpResponse 
		response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = () response).getWriter();
			
			// Obtain parameters from the client
			String lastName = request.getParameter("loanAmount");
			String firstName = request.getParameter("annualInterestRate");
		    String mi = request.getParameter("numberOfYears");
		
		
		out.println("loan Amount: <b>" + loanAmount + "</b> annual Interest Rate: <b>" + annualInterestRate + "</b> number Of Years: <b>" + numberOfYears + "</b><br>");
		
		
		 out.close(); // Close stream
		 }
	 }

