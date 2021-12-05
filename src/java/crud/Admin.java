
package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import test.util;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Admin {
    
    public int addUser( AdminBean admin) throws Exception {
                Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		con = util.getConnection();
		int i = 0;
                try {
                        pstmt = con.prepareStatement("insert into records (firstname,lastname,email,course) values(?,?,?,?)");
                        pstmt.setString(1, admin.getFirstname());
			pstmt.setString(2, admin.getLastname());
                        pstmt.setString(3, admin.getEmail());
                        pstmt.setString(4, admin.getCourse());
			i= pstmt.executeUpdate();
                        return i;
		}catch(Exception e) {
			throw new Exception("Error in reg database");
		}finally {
			if(con!=null)
                        con.close();
		}
		
    }
    
    public List report() throws SQLException, Exception {
                Connection con;
		PreparedStatement pstmt;
                con = util.getConnection();
		ResultSet rs = null;
                List<AdminBean> ad = new ArrayList();
		try {
			pstmt = con.prepareStatement("select firstname,lastname,email,course from records");
			rs = pstmt.executeQuery();
                        
                        int i = 0;
                        while(rs.next()){
                            
                           i++;
                            AdminBean admin1 = new AdminBean();
                            admin1.setSrNo(i);
                            admin1.setFirstname(rs.getString("firstname"));
                            admin1.setLastname(rs.getString("lastname"));
                            admin1.setEmail(rs.getString("email"));
                            admin1.setCourse(rs.getString("course"));
                            ad.add(admin1);
                        
                        }
			return ad;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if(con!=null)
                            con.close();
		}
	}
	
    public List fetchUserDetails(String email) throws SQLException, Exception {
		Connection con;
		PreparedStatement pstmt;
                con = util.getConnection();
                ResultSet rs = null;
                List<AdminBean> ad = new ArrayList();
		try {
			String sql = "select firstname,lastname,email,course from records where email=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
                        
                        while(rs.next()) {
                                AdminBean admin2= new AdminBean();
				admin2.setFirstname(rs.getString("firstname"));
                                admin2.setLastname(rs.getString("lastname"));
                                admin2.setEmail(rs.getString("email"));
                                admin2.setCourse(rs.getString("course"));
                                
			}
			return ad;
                     //return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if(con!=null)
                           con.close();
			}
		}
	
    public int updateUserDetails(String firstname,String lastname,String email,String course, String uemailhidden)
			throws SQLException, Exception {
                Connection con;
		PreparedStatement pstmt;
                con = util.getConnection();
	
		int i = 0;
		try {
			String sql = "update records set firstname = ?, lastname= ? ,email = ?,course = ?where email = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3, email);
			pstmt.setString(4, course);
			pstmt.setString(5, uemailhidden);
			i = pstmt.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
			return 0;
		} finally {
			if(con!=null)
                           con.close();
			}
		}
    public int deleteUserDetails(String email) throws SQLException, Exception {
                Connection con;
		PreparedStatement pstmt;
                con = util.getConnection();
	
		int i = 0;
		try {
			String sql = "delete from records where email= ?";
                         pstmt = con.prepareStatement(sql);
			pstmt.setString(1, email);
			i = pstmt.executeUpdate();
                        
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
			return 0;
		} finally {
			if(con!=null)
                           con.close();
			}
	}
	
}
