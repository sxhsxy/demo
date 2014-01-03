package xiaohu;
// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String loginName, String password, String name) {
        super(loginName, password, name);        
    }
    
    /** full constructor */
    public User(String loginName, String password, String name, String gender, String email, String phone, String mobile, String remarks) {
        super(loginName, password, name, gender, email, phone, mobile, remarks);        
    }
   
}
