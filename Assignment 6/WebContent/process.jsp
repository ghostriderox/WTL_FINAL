<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   <%         
           String uname=request.getParameter("uname");
           String password=request.getParameter("password");
          
           boolean flag=true;
           if(flag==true)
           {           
               session.setAttribute("uname", uname);
               response.sendRedirect("NewFile.jsp");    
           }	
           
   	%>
           <br><br><div>
               <a href="logout.jsp">Log Out!</a>
           </div>
           
    </body>
</html>