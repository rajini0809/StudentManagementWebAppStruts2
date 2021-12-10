<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
.button-register {background-color: green;color: white;}
.button-report {background-color: #000000;color: white;margin-left: 30%;}
</style>
    </head>
    <body>
        <div class ="topnav" >
            <a href="logout"><button  type="button">Logout</button></a>
             <a href="report"><button  type="button">Report</button></a><br></br>
        </div>
        <div align="center">
            <h1 style="color:greenyellow">
            Hello <s:property value="username"/> Welcome To Student Management System!!!
            
            
        </h1>
            <s:form action="registeruser" method="post">
		<s:textfield label="First Name" name="firstname" />
		<s:textfield label="Last Name" name="lastname" />
		<s:textfield  label="Email" name="email" />
                <s:select label="Course" name="course" headerKey="-1" headerValue="Select course" list="courseList"  />
                <s:submit cssClass="button-register" value="Add Details" />
            </s:form>
                
       </br></br>
       
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
      </div>
    </body>
</html>
