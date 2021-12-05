package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    
       
    public static int registerUser( EndUser user) throws Exception {
                Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		con = util.getConnection();
		int flag = 0;
                try {
                        flag = con.createStatement().executeUpdate("insert into usertable(username,userpassword,userrealname,CDateTime,UDateTime,UpdateBy) values('"+user.getUsername()+"','"+user.getUserpassword()+"','"+user.getUserrealname()+"','"+user.getCDateTime()+"','"+user.getUDateTime()+"','"+user.getUsername()+"');");
			
                        
		}catch(Exception e) {
			throw new Exception("Error in reg database");
		}finally {
			if(con!=null)
                        con.close();
		}
		return flag;
    }
    
     public  EndUser getUser(EndUser user) throws Exception{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con =  util.getConnection();
		EndUser user2 = null;
		try {
			pstmt = con.prepareStatement("select * from usertable where username=? and userpassword=?");
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getUserpassword());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user2 = new EndUser();
				user2.setId(rs.getInt("Id"));
				user2.setUsername(rs.getString("username"));
				user2.setUserpassword(rs.getString("userpassword"));
				user2.setUserrealname(rs.getString("userrealname"));
                                
			}
		}catch(Exception e) {
			 throw new Exception("Error in login database");
		}finally {
			if(con!=null)
                        con.close();
		}
		return user2;
	}

}

    

