package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/servlet/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		FormBean form = new FormBean();
		String name = request.getParameter("name");
		String mailAddress = request.getParameter("mailAddress");
		String contact = request.getParameter("contact");
		
		if(isEmpty(name)
			|| isEmpty(mailAddress)
			|| isEmpty(contact)) {
			request.getRequestDispatcher("../jsp/contact.jsp")
				.forward(request, response);
		}
		
		String company = request.getParameter("company");
		String[] mailType = request.getParameterValues("mailType");
		boolean yesno = isYes(request.getParameter("yesno"));
		
		form.setName(name);
		form.setCompany(company);
		form.setMailAddress(mailAddress);
		form.setContact(contact);
		form.setMailType(mailType);
		form.setNeedDocs(yesno);
		
		request.setAttribute("form", form);
		request.getRequestDispatcher("../jsp/contactResult.jsp")
			.forward(request, response);
	}
	private boolean isEmpty(String value) {
		if(value.equals(""))
			return true;
		else
			return false;
	}
	private boolean isYes(String value) {
		if(value.equals("yes"))
			return true;
		else
			return false;
	}
}
