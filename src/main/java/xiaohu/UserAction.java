package xiaohu;

import java.util.List;

import org.apache.log4j.Logger;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(UserAction.class.getName());
	private int id;
	private User user;
	private UserService service = new UserService();

	List userList;

	
	public String execute() throws Exception {

		logger.debug("In execute method");
		return SUCCESS;
	}
	public String list() throws Exception {
		userList = service.list();
		return "list";
	}
	public String edit() throws Exception {
		user = service.getUser(id);
		return "edit";
	}
	public String create() throws Exception {
		user = new User();
		return "edit";
	}
	public String delete() throws Exception {
		service.delete(id);
		userList = service.list();
		return "list";
	}
	public String save() throws Exception {
		service.save(user);
		userList = service.list();
		return "list";
	}
	public String update() throws Exception {
		service.update(user);
		userList = service.list();
		return "list";
	}
	
	public List getUserList() {
		return userList;
	}
	public void setUserList(List userList) {
		this.userList = userList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
