<%@page import="com.jsp.servlet_simple_crud_operation.dao.UserDao"%>
<%@page import="com.jsp.servlet_simple_crud_operation.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display-Page</title>
<link rel="stylesheet" href="CSS/Display.css">
</head>
<body>

<%

List<User> users=new UserDao().getAllUserDao();

%>

<table  border="10" >
 <tr style="color: green;">
 <th>ID: </th>
  <th>NAME: </th>
  <th>EMAIL: </th>
  <th> DOB:</th>
  <th>GENDER: </th>
  <th colspan="2">ACTION:</th>
 
 </tr>
<%
for(User user: users){
%>	

<tr>


<td><%=user.getId() %></td>
<td><%=user.getName() %></td>
<td><%=user.getEmail()%></td>
<td><%=user.getDob() %></td>
<td><%=user.getGender()%></td>
<td><button ><a style="color:red" href="delete?id=<%=user.getId()%>">DELETE</a></button></td>
<td><button><a style="color:maroon;" href="Edit.jsp?id=<%=user.getId()%>">EDIT</a></button></td>


</tr>
<% 
}
%>

</table>
</body>
</html>