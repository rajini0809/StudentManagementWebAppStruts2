<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color:greenyellow">
            Hello <s:property value="username"/> You have successfully logged in!!!</br>
            <s:a action="logout"> Logout</s:a>
            
            
        </h1>
    </body>
</html>
