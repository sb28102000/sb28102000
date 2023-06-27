package com.incapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n=n1+n2;
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Addition</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Add App</h1>");
		out.print("<hr/>");
		out.print("<p>Addition of "+n1+" and "+n2+"= "+n+" </p>");
		out.print("<p>with GET </p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n=n1+n2;
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Addition</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Add App</h1>");
		out.print("<hr/>");
		out.print("<p>Addition of "+n1+" and "+n2+"= "+n+" </p>");
		out.print("<p>with POST </p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n=n1+n2;
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Addition</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Add App</h1>");
		out.print("<hr/>");
		out.print("<p>Addition of "+n1+" and "+n2+"= "+n+" </p>");
		out.print("<p>with SERVICE </p>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}