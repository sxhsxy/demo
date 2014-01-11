package xiaohu;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class HibernateTest {
	 @Test public void testInsertUser(){ 
		 Transaction trans;
		 User user = new User("xiaohu", "123456", "沈小虎");
		 UserDAO dao = new UserDAO();
		 dao.save(user);
		 System.out.println(user.getName()+user.getId());
		 //assertEquals(user.getName(), dao.findById(user.getId()).getName()); 
		 Department dept = new Department("科技教育科");
		 User deptUser = new User("sxh", "123456", "沈老虎");
		 deptUser.setDepartment(dept);
		 Session session = HibernateSessionFactory.getSession();
		 trans = session.beginTransaction();
		 session.save(dept);
		 session.save(deptUser);
		 trans.commit();
		 session.close();
		 
		 
		 
	 } 

}
