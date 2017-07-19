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

      <TD><h5><i>Education</i></h5></TD>
  </TR>
  
 <TR>
      <TD>Major</TD>
      <TD><input type = "text" name = "Major" ></TD>
  </TR>
 <TR>
      <TD>Year of Grad.</TD>
      <TD><input type = "text" name = "grad" ></TD>
  </TR>
 <TR>
      <TD>University</TD>
      <TD><input type = "text" name = "University" ></TD>
  </TR>
 
</table>


<!-- <a href = "#add" >Add more</a> -->

<br><input type = "submit" value = "Register Customer">
</form>
</body>
</html>