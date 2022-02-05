package myJPA;

import myJPA.dao.UserDao;
import myJPA.model.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		
		User user = userDao.getUserBId(1L);
		
		System.out.println(user);

	}

}
