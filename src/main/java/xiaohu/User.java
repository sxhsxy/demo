package xiaohu;
// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User implements java.io.Serializable {

    // Constructors


    // Fields    

     private Integer id;
     private String loginName;
     private String password;
     private String name;
     private String gender;
     private String email;
     private String phone;
     private String mobile;
     private String remarks;
     private Department department;


    // Constructors

    @Override
	public String toString() {
		return "User [loginName=" + loginName + ", name=" + name + ", gender="
				+ gender + ", email=" + email + ", phone=" + phone
				+ ", mobile=" + mobile + ", department=" + department + "]";
	}

	/** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String loginName, String password, String name) {
        this.loginName = loginName;
        this.password = password;
        this.name = name;
    }
    
    /** full constructor */
    public User(String loginName, String password, String name, String gender, String email, String phone, String mobile, String remarks, Department department) {
        this.loginName = loginName;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.remarks = remarks;
        this.department = department;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return this.loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
   
}
