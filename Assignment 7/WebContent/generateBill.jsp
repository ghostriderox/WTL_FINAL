
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <div align="center">
       <%
            String quantity[]=request.getParameterValues("itemCount");
            String total[]=request.getParameterValues("itemTotal");
            String name[]=request.getParameterValues("itemName");
            String price[]=request.getParameterValues("itemPrice");
            //out.print(request.getParameter("itemTotal"));
            String finalTotal=request.getParameter("total");
            String username=request.getParameter("uname");
            String email=request.getParameter("email_id");
            
            %>
            <h1>Bill</h1>
            <table border="1" style="border-spacing: 0px;">
                <tr><th>Sr.No</th><th>Item Name</th><th>Item Price</th><th>Item Count</th><th>Total</th></tr>
            
            <%
                
                for(int i=0;i<3;i++)
                {
                	if(Integer.parseInt(quantity[i])>= 0)
                	{
                		String parts[]=name[i].split("-");
                        out.print("<tr><td>"+(i+1)+"</td><td>"+ name[i]+"</td><td>"+ price[i]+"</td><td>"+quantity[i]+"</td><td>"+total[i]+"</td></tr>\n");
                	}
                	
                	
                }
            %>
            </table>
            <% out.println("<h2>Total amount to be paid : Rs "+finalTotal+"</h2>"); %>
             
            <h3>Thank You placing order. :)</h3>
      </div>  
      
       
    </body>
</html>