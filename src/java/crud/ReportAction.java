
package crud;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.List;


public class ReportAction extends ActionSupport implements ModelDriven {
    
//    ResultSet rs = null;
    AdminBean admin = new AdminBean();
//    Admin admindao = new Admin();
    private List<AdminBean> beanList;
    private boolean noData;
    String msg;
    Admin admindao = new Admin();
    String submitType;
    String uemailhidden;
   
    public String execute() throws Exception {
                
        try {
		
            this.beanList = admindao.report();
      
            } catch (Exception e) {
			e.printStackTrace();
            }
		return "REPORT";
        
    }
    

    public String updatedetails() throws Exception {
    
    try {
            if (submitType.equals("updatedata")) {
            //rs = admindao.fetchUserDetails(email.trim());
            this.beanList = admindao.fetchUserDetails(admin.getEmail().trim());
            } else {
		int i = admindao.updateUserDetails(admin.getFirstname(), admin.getLastname(), admin.getEmail(), admin.getCourse(), uemailhidden);
		if (i > 0) {
                    msg = "Record Updated Successfully";
		} else {
                    msg = "error";
		}
            }

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";
    }
    

    public String deleterecord() throws Exception {
           try {
               
               int isDeleted = admindao.deleteUserDetails(admin.getEmail());
           
                if (isDeleted > 0) {
                    msg = "Record deleted successfully";
                } else {
                    msg = "Some error";
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
            return "DELETE";
      
      } 

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public List<AdminBean> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<AdminBean> beanList) {
        this.beanList = beanList;
    }

    public boolean isNoData() {
        return noData;
    }

    public void setNoData(boolean noData) {
        this.noData = noData;
    }
    
    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    public String getUemailhidden() {
        return uemailhidden;
    }

    public void setUemailhidden(String uemailhidden) {
        this.uemailhidden = uemailhidden;
    }

    @Override
    public Object getModel() {
        return admin;
    }
        
}
