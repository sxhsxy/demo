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
	private UserService userService = new UserService();
	private DepartmentService departmentService = new DepartmentService();
	List userList;
	List departmentList = departmentService.listAll();

	
	public String execute() throws Exception {

		logger.debug("In execute method");
		return SUCCESS;
	}
	public String list() throws Exception {
		userList = userService.listAll();
		return "list";
	}
	public String edit() throws Exception {
		user = userService.getUser(id);
		return "edit";
	}
	public String create() throws Exception {
		user = new User();
		return "edit";
	}
	public String delete() throws Exception {
		userService.delete(id);
		userList = userService.listAll();
		return "list";
	}
	public String save() throws Exception {
		userService.save(user);
		userList = userService.listAll();
		return "list";
	}
	public String update() throws Exception {
		userService.update(user);
		userList = userService.listAll();
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
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public List getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List departmentList) {
		this.departmentList = departmentList;
	}
}
