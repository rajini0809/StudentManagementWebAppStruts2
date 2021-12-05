package test;

public class EndUser {
        private int Id;
	private String username;
	private String userpassword;
	private String userrealname;
        private String CDateTime;
        private String UDateTime ;
        private String UpdateBy;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname;
    }
        
    public String getCDateTime() {
        return CDateTime;
    }

    public void setCDateTime(String CDateTime) {
        this.CDateTime = CDateTime;
    }

    public String getUDateTime() {
        return UDateTime;
    }

    public void setUDateTime(String UDateTime) {
        this.UDateTime = UDateTime;
    }

    public String getUpdateBy() {
        return UpdateBy;
    }

    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }
}
