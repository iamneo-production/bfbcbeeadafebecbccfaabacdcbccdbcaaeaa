package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.StringAdvanceMethod;

@WebServlet(urlPatterns = { "/jspservlet-app-stringmania/level3" })
public class ThirdLevelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StringAdvanceMethod stringadvance = new StringAdvanceMethod();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("level3.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String input1 = request.getParameter("input1");
		String input2 = request.getParameter("input2");
		String concatenation = request.getParameter("concatenation");
		String split = request.getParameter("split");
		String indexOf = request.getParameter("indexOf");
		String seeAnswer = request.getParameter("seeanswer");
		String end = request.getParameter("end");

		stringadvance.setInput1(input1);
		stringadvance.setInput2(input2);

		if (seeAnswer != null) {
			if (concatenation != null) {
				String output = stringadvance.concat(input1, input2);
				// System.out.println(output);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level3.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (split != null) {
				String output = stringadvance.split(input1, input2);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level3.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (seeAnswer != null) {
			if (indexOf != null) {
				String output = stringadvance.indexOf(input1, input2);
				request.setAttribute("output", output);
				RequestDispatcher dispatcher = request.getRequestDispatcher("level3.jsp");
				dispatcher.forward(request, response);
			}
		}

		if (end != null) {
			response.setContentType("text/html");
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Well Done!');");
			out.println("</script>");
		}
	}
}
