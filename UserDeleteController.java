package com.jsp.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.jsp.servlet_simple_crud_operation.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(value="/delete")
public class UserDeleteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	
	System.out.println(id);
	
	boolean b=new UserDao().deleteUserByIdDao(id);
	
	if(b) {
		req.getRequestDispatcher("Display.jsp").forward(req, resp);
	}
	}
}
