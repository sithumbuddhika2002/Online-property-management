package com.servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.model.User;
import com.service.UserService;

@WebServlet("/singleDataButton")
public class singleDataButton extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public singleDataButton() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User usr = new User();
		usr.setEmail(request.getParameter("email"));
		UserService service = new UserService();
		User user = service.singleDataButton(usr);
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		request.setAttribute("user", user);
		
		dispatcher.forward(request, response);
	}

}
