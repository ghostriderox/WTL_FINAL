<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
    <%@page import="java.sql.*" %>
  </head>
  <body>
    <%
      String username = request.getParameter("uname");
      String password = request.getParameter("password");

      session = request.getSession();

      Class.forName("com.mysql.jdbc.Driver");

      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "newuser", "password");

      Statement stmt = conn.createStatement();

      ResultSet rs = stmt.executeQuery("select * from student where student_name="+username+";");


      if(rs.next()){
    %>
    <h1>Successful Login</h1>
    <button type="button" name="button"><a href="logout.jsp">Logout</a></button>
    <%
      }
      else{
    %>
    <h1>Invalid Credentials</h1>
    <%
      }
    %>
  </body>
</html>
