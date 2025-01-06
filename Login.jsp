<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login-Page</title>
<link rel="stylesheet" href="CSS/Login.css">
</head>
<body>


<%
	String message = (String) request.getAttribute("msg");
	if (message != null) {
	%>
	<h4 style="color: green;"><%=message%></h4>
	<%
	}
	%>
	

	
        <div class="login-box"> 
        <h2>Login</h2>
        <form action="Login" method="get">
            <div class="user-box">
                <input type="text"  name="useremail">
                <label>Username</label>
            </div>
            <div class="user-box">
                <input type="password" name="userpassword">
                <label>Password</label>
            </div>
            
                          
            
            <a href="#">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
                
             <input type="submit" value="LOGIN">
             

           </a> <br>
<h5 style="color: silver;">If you want to Registered then click Here <a style="color: fuchsia;" href= "Register.jsp">REGISTER</a></h5>
 
        </form>
    </div>
    
</body>
</html>