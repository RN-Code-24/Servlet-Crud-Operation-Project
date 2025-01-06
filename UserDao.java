package com.jsp.servlet_simple_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jsp.servlet_simple_crud_operation.connection.UserConnection;
import com.jsp.servlet_simple_crud_operation.entity.User;
import com.mysql.cj.jdbc.result.ResultSetFactory;

public class UserDao {
	
	Connection connection =UserConnection.getUserConnection();
    final String INSERT_USER_QUERY="insert into user(id,name,email,password,dob,gender) values(?,?,?,?,?,?)";
    final String SELECT_USER_WITH_EMAIL_QUERY="SELECT email,password FROM USER WHERE email= ? ";
  
    public User saveUserDao(User user) {
	   
	   try {
		PreparedStatement ps=connection.prepareStatement(INSERT_USER_QUERY);
	
	    ps.setInt(1, user.getId());
	    ps.setString(2, user.getName());
	    ps.setString(3,user.getEmail());
	    ps.setString(4,user.getPassword());
	    ps.setObject(5, user.getDob());
	    ps.setString(6,user.getGender());
	    
	    int a=ps.executeUpdate();
	    if(a!=0) {
	    	return user;
	    }else {
	    	return null;
	    }
	   } catch (SQLException e) {

		e.printStackTrace();
		return null;
	}
	   

   }
    
    
public User getUserByEmailDao(String email) {
	
	try {
		PreparedStatement ps=connection.prepareStatement(SELECT_USER_WITH_EMAIL_QUERY);
	
		ps.setString(1, email);
		
		ResultSet resultSet =ps.executeQuery();
	
		
		if(resultSet.next()) {
			
			String email1=resultSet.getString("email");
			String password=resultSet.getString("password");
			
			return new User(email1,password);
			
		}else {
			return null;
		}

	
	} catch (SQLException e) {
	
		e.printStackTrace();
		return null;

	}

	}
 //Method to fetch all user from the Mysql 'user' table
public List<User> getAllUserDao(){
	
	List<User> users=new ArrayList<User>();
	
	String sql="SELECT * FROM user";
	
	
	try {
		Statement statement = connection.createStatement();
		ResultSet resultSet=statement.executeQuery(sql);

		while(resultSet.next()) {
			
			
			int id=resultSet.getInt("id");
			String name=resultSet.getString("name");
			String email=resultSet.getString("email");
			String password=resultSet.getString("password");
			LocalDate dob=resultSet.getDate("dob").toLocalDate();
			String gender=resultSet.getString("gender");
			
			User user=new User(id,name,email,password,dob,gender);
			users.add(user);
		}
		return users;


	} catch (SQLException e) {

		e.printStackTrace();
		return null;
	}
	
		
		
	}

public boolean deleteUserByIdDao(int id) {
	
	try {
		PreparedStatement ps=connection.prepareStatement("delete from user where id=?");
		ps.setInt(1, id);
		
		int a=ps.executeUpdate();
		
		if(a!=0)
		{
			return true;
		}else {
			return false;
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	}
	
}
}








