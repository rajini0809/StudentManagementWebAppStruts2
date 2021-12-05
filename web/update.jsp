<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class ="topnav" >
            <a href="report">
	<button type="button">Report</button>
            </a></br></br>
        </div>
        
        <form action=updatedetails method="post">
		<pre>
<b>First name:</b><input type="text" name="firstname" value='<s:property value="firstname"/>'>

<b>Last name: </b><input type="text" name="lastname" value='<s:property value="lastname"/>'>		
		
<b>Email:     </b><input type="email"  name="email" value='<s:property value="email"/>'>
		      <input type="hidden" name="uemailhidden" value='<s:property value="email"/>'>
		
<b>Course:    </b><input type="text" name="course" value='<s:property value="course"/>'>
		
		<button name="submitType" value="update" type="submit">Update</button>
		</pre>
	</form>
        
	<s:if test="i>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
                </br></br>   
         

    </body>
</html>
