package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.jsp.servlet_simple_crud_operation.dao.UserDao;
import com.jsp.servlet_simple_crud_operation.entity.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class InserUserController  implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		UserDao dao=new UserDao();
		PrintWriter printWriter=res.getWriter();
		res.setContentType("text/html");
		
		//String id=req.getParameter("userid");
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		//String dob=LocalDate.parse(req.getParaameter(("dob"));
		LocalDate dob=LocalDate.parse(req.getParameter("dob"));
		String gender=req.getParameter("gender");
		
		User user=new User(id,name,email,password,dob,gender);
		
		User user2=dao.saveUserDao(user);
		
		if(user2!=null) {
			
			req.setAttribute("msg", "Registation Successful.");
			printWriter.write("<html><body><h5 style='color:green;'>Registered Successfully.</h5></body></html>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
			dispatcher.include(req, res);
		}else {
			req.setAttribute("msg", "Not Register");
	    	//printWriter.write("<html><body><h5 style='color:red;'>Not Registered..</h5></body></html>");
	    	RequestDispatcher dispatcher=req.getRequestDispatcher("Register.jsp");
	    	dispatcher.include(req, res);

		}
		
		//PrintWriter printWriter=res.getWriter();
//		
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(email);
//		System.out.println(password);
//		System.out.println(dob);
//		System.out.println(gender);
//		
//		printWriter.write(id+" ");
//		//printWriter.write(id+""+name+""+email);
//
//		
//		printWriter.write("<html><body><h5 style='color:red;'>"+id+"</h5></body></html>");
//		
//		
		
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
