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

@WebServlet("/deleteUser")
public class deleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public deleteUser() {
        super();
    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User us = new User();
		
		us.setEmail(request.getParameter("email"));
		System.out.println("email : " + us.getEmail());
		UserService service = new UserService();
		
		service.deleteUser(us);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		
		dispatcher.forward(request, response);
	}

}
