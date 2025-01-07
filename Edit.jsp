<%@page import="com.jsp.servlet_simple_crud_operation.entity.User"%>
<%@page import="com.jsp.servlet_simple_crud_operation.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit-Page</title>
<link rel="stylesheet" href="CSS/Edit.css">

</head>
<body>
   <%
    int id=Integer.parseInt(request.getParameter("id"));
    User user=new  UserDao().getUserByIdDao(id);
  %>
  
  
      
      
      <div class="container">
       <h2>Edit Here <br>
            
        Id is:<%=id %> 
       </h2>
       
        
        <form action="userUpdate" method="post" class="registration-form">
            <div class="form-group">
            
                <label for="id">ID</label>
                <input type="text" id="id" name="id" value="<%=user.getId()%>" readonly="readonly">
            </div>
            
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" id="name" name="name" value="<%=user.getName()%>">
            </div>
            
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" value="<%=user.getEmail()%>">
            </div>
            
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" value="<%=user.getPassword()%>">
            </div>
            
            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" id="dob" name="dob" value="<%=user.getDob()%>">
            </div>

            <div class="form-group">
            <label for="gender">Gender</label>
                <select id="gender" name="gender" required>
                    <option value="" disabled selected>Select your gender</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="other">Other</option>
                </select>
            </div>
            
            <button type="submit">Update</button><br>
            		            
            
        </form>
    </div>
</body>
</html>