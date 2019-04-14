<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <%
      request.getSession().invalidate();
      response.sendRedirect("login.html");
    %>
  </body>
</html>
