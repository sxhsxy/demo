package xiaohu;

import static org.junit.Assert.assertEquals;

import org.hibernate.Transaction;
import org.junit.Test;

public class HibernateTest {
	 @Test public void testInsertUser(){ 
		 Transaction trans;
		 User user = new User("xiaohu", "123456", "沈小虎");
		 UserDAO dao = new UserDAO();
		 trans = dao.getSession().beginTransaction();
		 dao.save(user);
		 trans.commit();
		 System.out.println(user.getName()+user.getId());
		 //assertEquals(user.getName(), dao.findById(user.getId()).getName()); 
		 Department dept = new Department("科技教育科");
		 User deptUser = new User("sxh", "123456", "沈老虎");
		 deptUser.setDepartment(dept);
		 ;
	 } 

}
