package course;

public class courseBean {
    private int id;
    private String ccourse;

    public courseBean(int id, String ccourse) {
        this.id = id;
        this.ccourse = ccourse;
    }

    courseBean() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCcourse() {
        return ccourse;
    }
    
    public void setCcourse(String ccourse) {
        this.ccourse = ccourse;
    }

    @Override
    public String toString() {
        return "courseBean{" + "id=" + id + ", ccourse=" + ccourse + '}';
    }


    

    
    
    
    
}
