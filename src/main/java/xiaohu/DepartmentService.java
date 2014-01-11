package xiaohu;

import java.util.List;

import org.apache.log4j.Logger;

public class DepartmentService {
	// Create a Logger object
	private static final Logger logger = Logger.getLogger(DepartmentService.class
			.getName());
	private DepartmentDAO dao = new DepartmentDAO();
	
	public List<Department> listAll() {

		return dao.findAll();

	}
}
