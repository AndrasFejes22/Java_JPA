package myJPA;

import myJPA.dao.UserDao;
import myJPA.model.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		
		User user = userDao.getUserBId(3L);
		//User user2 = userDao.getUserBName("Gipsz Jakab");
		
		System.out.println(user);
		//System.out.println(user2);

	}

}
