<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <table width="100%" height="100%" border="0" cellpadding ="0" align="center">
                <tr>
                    <td align="center" valign="middle">
                        <table cellpading="3" cellspacing="3" width="350" border="0" bgcolor="gray">
                            <tr>
                                 <td height="25" colspan="2" align="left" valign="middle" bgcolor="#FF9900" class= "style2">
                                        <div align="center">
                                            <strong>Login Form!</strong>
                                        </div>
                                    </td>
                                 <s:form action="loginaction" >
                                <s:textfield name="username" label="Enter your username"/></br>
                                <s:password name ="userpassword" label="Enter your password"/></br>
                                <s:submit value="Login" align="center"/>
                                 </s:form></br></br>
                                <a href="Registration.jsp">Go to Register</a>
                                
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
