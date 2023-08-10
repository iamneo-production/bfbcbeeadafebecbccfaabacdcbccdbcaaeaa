package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.StringBoolean;

@WebServlet(urlPatterns = { "/jspservlet-app-stringmania/level2" })
public class SecondLevelServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	StringBoolean stringboolean = new StringBoolean();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("level2.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String input1 = request.getParameter("input1");
		String input2 = request.getParameter("input2");
		String contains = request.getParameter("contains");
		String endsWith = request.getParameter("endsWith");
		String startsWith = request.getParameter("startsWith");
		String equals = request.getParameter("equals");
		String equalsIgnoreCase = request.getParameter("equalsIgnoreCase");
		String seeAnswer = request.getParameter("seeanswer");
		String thirdLevel = request.getParameter("thirdlevel");

		System.out.println(seeAnswer);

		stringboolean.setInput1(input1);
		stringboolean.setInput2(input2);

		if (seeAnswer != null) {
			if (contains != null) {
				boolean output = stringboolean.contains(input1, input2);
				System.out.println(output);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level2.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (endsWith != null) {
				boolean output = stringboolean.endsWith(input1, input2);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level2.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (startsWith != null) {
				boolean output = stringboolean.startsWith(input1, input2);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level2.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (equals != null) {
				boolean output = stringboolean.equals(input1, input2);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level2.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (equalsIgnoreCase != null) {
				boolean output = stringboolean.equalsIgnoreCase(input1, input2);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level2.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (thirdLevel != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("level3.jsp");
			dispatcher.forward(request, response);
		}
	}

}
