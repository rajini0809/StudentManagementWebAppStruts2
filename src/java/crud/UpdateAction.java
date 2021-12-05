package crud;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.List;

public class UpdateAction extends ActionSupport {
    private String firstname = "", lastname = "", email = "", course = "", uemailhidden = "";
	private String msg = "";
	ResultSet rs = null;
	//Admin dao = new Admin();
	String submitType;
        Admin admindao = new Admin();
        private List<AdminBean> beanList;
    
    public String execute() throws Exception {
        
        try {
			if (submitType.equals("updatedata")) {
                                //rs = admindao.fetchUserDetails(email.trim());
				this.beanList = admindao.fetchUserDetails(email.trim());
				/*if (rs != null) {
					while (rs.next()) {
						firstname = rs.getString("firstname");
						lastname = rs.getString("lastname");
						email = rs.getString("email");
						course = rs.getString("course");
					}
				}*/
			} else {
				int i = admindao.updateUserDetails(firstname, lastname, email, course, uemailhidden);
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

        
    public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUemailhidden() {
		return uemailhidden;
	}

	public void setUemailhidden(String uemailhidden) {
		this.uemailhidden = uemailhidden;
	}

	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}
        public List<AdminBean> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<AdminBean> beanList) {
        this.beanList = beanList;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
}
