package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.jsp.servlet_simple_crud_operation.dao.UserDao;
import com.jsp.servlet_simple_crud_operation.entity.User;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class LoginUserConttroller extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		UserDao dao=new UserDao();
		
		String email=req.getParameter("useremail");//
	//	System.out.println(email);
		String password=req.getParameter("userpassword");//
	//	System.out.println();
		User user=dao.getUserByEmailDao(email);   
		//System.out.println(user);
		
		if(user!=null) {
			
			if(user.getPassword().equals(password)) {
				req.getRequestDispatcher("Display.jsp").forward(req, res);
			}else {
				req.setAttribute("msg","Password is wrong");
				req.getRequestDispatcher("Login.jsp").forward(req, res);
			}
		}else {
			req.setAttribute("msg","Email is wrong");
			req.getRequestDispatcher("Login.jsp").forward(req, res);
		}
		
	}
	
	

}
