<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib uri= "/struts-tags" prefix="d" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<d:form action="register.action" namespace="myspace"><br>
<d:textfield  label="UserName" name="name" id="name"/><br>
<d:password label="Password" name="pwd" id="pwd"/><br>
<d:submit value="Register"/>
</d:form>
</body>
</html> 