package com.servelet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



import com.model.User;
import com.service.UserService;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public login() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User u1 = new User();
		u1.setEmail(request.getParameter("email"));
		u1.setPassword(request.getParameter("password"));
		
		UserService service = new UserService();
		boolean status = service.validate(u1);
		
		if(status) {
			
			User user = service.getOne(u1);
			System.out.println("inside if status");
			
			if (user != null) {
			    System.out.println("User found:");
			    System.out.println("Name: " + user.getName());
			    System.out.println("Email: " + user.getEmail());
			    System.out.println("Password: " + user.getPassword());
			    System.out.println("Address: " + user.getAddress());
			    System.out.println("Address2: " + user.getAddress2());
			    System.out.println("City: " + user.getCity());
			    System.out.println("State: " + user.getState());
			    System.out.println("Zip: " + user.getZip());
			} else {
			    System.out.println("User not found!");
			}
			
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("userHome.jsp");
			
			dispatcher.forward(request, response);
			

		}
		
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}
