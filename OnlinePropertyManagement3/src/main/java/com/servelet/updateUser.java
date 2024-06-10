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

@WebServlet("/updateUser")
public class updateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public updateUser() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User usr = new User();
		
		usr.setName(request.getParameter("name"));
		usr.setEmail(request.getParameter("email"));
		usr.setPassword(request.getParameter("password"));
		usr.setAddress(request.getParameter("address"));
		usr.setAddress2(request.getParameter("address2"));
		usr.setCity(request.getParameter("city"));
		usr.setState(request.getParameter("state"));
		usr.setZip(request.getParameter("zip"));
		
		UserService service = new UserService();
		service.updateUser(usr);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("singleDataButton");
		dispatcher.forward(request, response);
		
		
	}
	

}
