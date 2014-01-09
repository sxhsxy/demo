package xiaohu;

import java.util.List;

import org.apache.log4j.Logger;


import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(UserAction.class.getName());
	
	private UserDAO dao = new UserDAO();

	List userList = dao.findAll();

	public String execute() throws Exception {

		logger.debug("In execute method");
		return SUCCESS;
	}
	public String list() throws Exception {
		return "list";
	}

}
