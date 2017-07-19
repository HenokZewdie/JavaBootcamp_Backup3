<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<form action="InsertToDB" method = "post">
<!-- ${name} is not in the database</h4> --><h4>
<h4>                     <u>Register Here</u></h4>
<table> 
 <TR>
      <TD>Full Name: </TD>
      <TD><input type = "text" name = "FullName"></TD>
  </TR>
 <TR>
      <TD>Email: </TD>
      <TD><input type = "text" name = "Email" ></TD>
  </TR>
 <TR>
<br><a href = "Education.jsp">Next</a>

</form>
</body>
</html>