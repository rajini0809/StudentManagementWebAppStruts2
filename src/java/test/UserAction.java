package test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import course.courseBean;
import course.courseDao;
import java.util.List;
import java.util.Map;



public class UserAction  extends ActionSupport implements ModelDriven{ 
        
    private EndUser user = new EndUser();
    private UserDao userDao = new UserDao();
    private List courseList;
    private courseDao dao = new courseDao();
    
    
   
    public String userLogin() throws Exception {
		String userpassword = passwordEncrypt.pEncode(user.getUserpassword());
                user.setUserpassword(userpassword);
                
		String forward = null;
		EndUser user2 = userDao.getUser(user);
                
		if(user2 != null) {
                   // String password = passwordEncrypt.pDecode(user2.getUserpassword());
                    //user2.setUserpassword(password);
                    Map<String,Object> session = ActionContext.getContext().getSession();
                    session.put("username", user.getUsername());
                    
                        courseList = dao.courseadd();
                        
			forward = "success";
		}else {
			forward = "error";
		}
		return forward;
                
                
	}
        
        
        
        public String userRegister() throws Exception {
		String userpassword = passwordEncrypt.pEncode(user.getUserpassword());
                user.setUserpassword(userpassword);
                user.setCDateTime(DateTimeSetting.getCurrentDateTime());
                user.setUDateTime(DateTimeSetting.getCurrentDateTime());
		String forward = ERROR;
		int flag = 0;
		EndUser user2 = (userDao.getUser(user));
		if(user2 != null) {
			forward = "error_user";
		}else {
			flag = userDao.registerUser(user);
			if(flag == 1) {
				forward = SUCCESS;
			}
		}
		return forward;
                
                
               }

    
    public Object getModel() {
        return user;
    }
        
     public String logout(){  
    Map<String,Object> session = ActionContext.getContext().getSession();
    session.remove("username");  
    return SUCCESS;  
    }    

    
public List getCourseList() {
        return courseList;
    }

    public void setCourseList(List courseList) {
        this.courseList = courseList;
    }
    

    

}
