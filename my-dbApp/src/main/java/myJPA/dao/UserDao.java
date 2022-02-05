package myJPA.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import myJPA.model.User;

//Data Acces Object, ez tképpen egy design pattern
public class UserDao {
	
	private EntityManagerFactory emf; //eza egy JPA-s interface
	
	public UserDao() {
		this.emf = Persistence.createEntityManagerFactory("blogs-pu");
	}
	
	//create, read, update, delete = CRUD, EntityManager elsõdleges feladatok
	
	public User getUserBId(Long id) {
		EntityManager entityManager = emf.createEntityManager();
		return entityManager.find(User.class, id);
	}


}
