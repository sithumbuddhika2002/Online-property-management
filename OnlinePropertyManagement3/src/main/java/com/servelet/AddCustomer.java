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

@WebServlet("/AddCustomer")
public class AddCustomer extends HttpServlet {
    private static final long serialVersionUID = 1L;
       

    public AddCustomer() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().append("Served at: ").append(request.getContextPath());
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User u = new User();
        u.setName(request.getParameter("name"));
        u.setEmail(request.getParameter("email"));
        u.setPassword(request.getParameter("password"));
        u.setAddress(request.getParameter("address"));
        u.setAddress2(request.getParameter("address2"));
        u.setCity(request.getParameter("city"));
        u.setState(request.getParameter("state"));
        u.setZip(request.getParameter("zip"));
        
        UserService service = new UserService();
        service.RegisterUser(u);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request, response);
    }
}
