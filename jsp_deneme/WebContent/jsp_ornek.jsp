<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
    <%@ page import="java.time.LocalTime" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
<title>Ornek</title>
</head>
<body>
  <%! LocalTime time1 = LocalTime.now(); %>
  <% LocalTime time2 = LocalTime.now(); %>

  <p><%= "Time 1: " + time1   %></p>
  <p><%= "Time 2: " + time2   %></p>
</body>
</html>