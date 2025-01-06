<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration-Page</title>
<link rel="stylesheet" href="CSS/Register.css">

</head>
<body>

<!-- //<h1 style="color: red">welcome to servlet</h1>
 -->


<%
			String message=(String)request.getAttribute("msg");
			if(message!=null){
		%>
		<h4 style="color: red;"><%=message%></h4>
		<%}%>
		
		
  <div class="container">
        <h2>Register Here</h2>
        
        <form action="RegisterPage" method="get" class="registration-form">
            <div class="form-group">
            
                <label for="id">ID</label>
                <input type="text" id="id" name="id" required placeholder="Enter your ID">
            </div>
            
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" id="name" name="name" required placeholder="Enter your name">
            </div>
            
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required placeholder="Enter your email">
            </div>
            
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required placeholder="Enter your password">
            </div>
            
            <div class="form-group">
                <label for="dob">Date of Birth</label>
                <input type="date" id="dob" name="dob" required>
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
            
            <button type="submit">Register</button><br>
            		            <h1 style="color: black;">If you are already Registered then click Here <a style="color: fuchsia;" href= "Login.jsp">LOGIN</a></h1>
            
        </form>
    </div>

</body>
</html>