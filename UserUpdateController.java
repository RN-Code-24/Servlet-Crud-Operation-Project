package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.time.LocalDate;

import com.jsp.servlet_simple_crud_operation.dao.UserDao;
import com.jsp.servlet_simple_crud_operation.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value="/userUpdate")
public class UserUpdateController  extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserDao dao =new UserDao();
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		LocalDate dob=LocalDate.parse(req.getParameter("dob"));
		String gender =req.getParameter("gender");
		
		User user=new User(id,name,email,password,dob,gender);
	    
		User user2=dao.updateUserColumnByUserIdDao(user);
		
		if(user2!=null) {
			req.getRequestDispatcher("Display.jsp").forward(req, resp);
		}
	}
}
