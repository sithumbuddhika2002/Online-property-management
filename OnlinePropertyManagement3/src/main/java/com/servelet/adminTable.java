package com.servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;

import com.model.User;
import com.service.UserService;

@WebServlet("/adminTable")
public class adminTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public adminTable() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserService service = new UserService();
		ArrayList<User> usr = service.getAllUser();
		request.setAttribute("user", usr);
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("adminTable.jsp");
		
		
		dispatcher1.forward(request, response);
	}

}
