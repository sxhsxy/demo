package xiaohu;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.log4j.Logger;

public class UserService {

	// Create a Logger object
	private static final Logger logger = Logger.getLogger(UserService.class
			.getName());
	private static UserDAO dao = new UserDAO();

	public List<User> list() {

		return dao.findAll();

	}

	public void save(User user) {

		dao.save(user);

	}


	public void update(User user) {

		dao.update(user);
	}

	public void delete(int id) {
		User user = dao.findById(id);
		if( user != null)
			dao.delete(user);

	}

	public User getUser(int id) {

		return dao.findById(id);

	}

}
