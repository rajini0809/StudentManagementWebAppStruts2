<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
    </head>
    <body>
        <div class ="topnav" >
            <a href="registeruser"><button  type="button">Add Details</button></a><br></br>
        </div>
        <div align="center">
        <div style="margin-top: 40px;">
		
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>Sr.No.</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Course</th>
                                                <th>Action</th>
						
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
                                            
						<td><s:property value="srNo" /></td>
						<td><s:property value="firstname" /></td>
						<td><s:property value="lastname" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="course" /></td>
						<td>
							<a href="updatedetails.action?submitType=updatedata&firstname=<s:property value="firstname"/>&lastname=<s:property value="lastname"/>&email=<s:property value="email"/>&course=<s:property value="course"/>">
								<button class="button-update">Update</button>
							</a>
                                                        <a href="deleterecord.action?email=<s:property value="email"/>">
								<button class="button-delete">Delete</button>
							</a>        
                                                </td>
					</tr>
				</s:iterator>
                        </table>
            </br></br>
		
	</div>
     </div>   
    </body>
</html>
