package course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import test.util;

public class courseDao {
    
    
    public List courseadd() throws SQLException, Exception {
                Connection con;
		PreparedStatement pstmt;
                con = util.getConnection();
		ResultSet rs = null;
                List ad = new ArrayList();
		try {
                        
			pstmt = con.prepareStatement("select * from courses");
			rs = pstmt.executeQuery();
                        
                        
                        while(rs.next()){
                            
                           
                            ad.add(rs.getString("ccourse"));
                        
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
    
}
