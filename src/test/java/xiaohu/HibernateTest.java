package xiaohu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HibernateTest {
	 @Test public void testInsertUser(){ 
		 User user = new User("xiaohu", "123456", "沈小虎");
		 UserDAO dao = new UserDAO();
		 dao.save(user);
		 ;
		 assertEquals(user.getName(), dao.findById(user.getId()).getName()); 
	 } 

}
