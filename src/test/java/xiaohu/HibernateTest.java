package xiaohu;

import static org.junit.Assert.assertEquals;

import org.hibernate.Transaction;
import org.junit.Test;

public class HibernateTest {
	 @Test public void testInsertUser(){ 
		 User user = new User("xiaohu", "123456", "沈小虎");
		 UserDAO dao = new UserDAO();
		 Transaction transaction = dao.getSession().beginTransaction();
		 dao.save(user);
		 transaction.commit();
		 System.out.println(user.getName()+user.getId());
		 System.out.println(dao.findAll().size());
		 //assertEquals(user.getName(), dao.findById(user.getId()).getName()); 
	 } 

}
