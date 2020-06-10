package com.test.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.ApplicationDao;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("==================Login do get");
		List<String> userTypes = new ArrayList<>();
		userTypes.add("Admin");
		userTypes.add("Gym Instructor");
		userTypes.add("Member");
		req.setAttribute("userTypes", userTypes);
		req.getRequestDispatcher("/html/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("assign privileges to the user for a successful login");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		req.getSession().setAttribute("username", username);
		ApplicationDao dao = new ApplicationDao();
		boolean isValid = dao.validateUser(username, password);
		
		String errorMessage= null;
		if(!isValid){
			errorMessage = "Invalid Credentials, please login again!";
			req.setAttribute("error", errorMessage);
			req.getRequestDispatcher("/html/login.jsp").forward(req,resp);
		}
		else{
			req.getRequestDispatcher("/html/home.jsp").forward(req, resp);
		}
		
	}

}
