package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.StringMethod;

@WebServlet(urlPatterns = { "/jspservlet-app-stringmania/level1" })
public class FirstLevelServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	StringMethod string = new StringMethod();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String input = request.getParameter("input");
		String lowerCase = request.getParameter("lowercase");
		String upperCase = request.getParameter("uppercase");
		String firstCharacter = request.getParameter("firstcharacter");
		String length = request.getParameter("length");
		String trim = request.getParameter("trim");
		String seeAnswer = request.getParameter("seeanswer");
		String secondLevel = request.getParameter("secondlevel");

		string.setInput(input);
		
		if (seeAnswer != null) {
			System.out.println("hello");
			if (lowerCase != null) {
				String output = string.lower(input);
				System.out.println(output);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level1.jsp");
				dispatcher.forward(request, response);
			}

		}

		if (seeAnswer != null) {
			if (upperCase != null) {
				String output = string.upper(input);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level1.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (firstCharacter != null) {
				String output = string.firstCharacter(input);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level1.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (length != null) {
				String output = string.length(input);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level1.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (trim != null) {
				String output = string.trim(input);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level1.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (secondLevel != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("level2.jsp");
			dispatcher.forward(request, response);
		}

	}

}
