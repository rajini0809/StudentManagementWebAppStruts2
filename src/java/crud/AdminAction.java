package crud;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import course.courseBean;
import course.courseDao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminAction extends ActionSupport implements ModelDriven {
    
    
    private AdminBean admin = new AdminBean();
    private Admin admindao = new Admin();
    private String msg = "";
    int ctr = 0;
    private List courseList;
    private courseDao dao = new courseDao();

    
    public String Add() throws Exception {
        
        try{
        ctr = admindao.addUser(admin);
        if (ctr > 0) {
            msg = "Added details Successfully";
        }else {
            msg = "Some error";
	}
        }catch (Exception e) {
            e.printStackTrace();
	}
        courseList = dao.courseadd();
        return "REGISTER";
    }
    
   
    
    
        public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

       
    public List getCourseList() {
        return courseList;
    }

    public void setCourseList(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Object getModel() {
        return admin;
    }
    
}
