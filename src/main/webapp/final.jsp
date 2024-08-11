<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%
out.println(new java.util.Date().toString()+"<br>");
out.println("hello "+request.getParameter("myName"));
%>
</body>
</html>