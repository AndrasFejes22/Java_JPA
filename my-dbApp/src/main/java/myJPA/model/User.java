package myJPA.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "blogs")
public class User {
	
	@Id
	private long id;//ez viszont ugyanaz legyen mint a database oszlop neve
	
	private String username;//ez viszont ugyanaz legyen mint a database oszlop neve
	/*
	private String number;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	*/
	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	private User() {} //erre a JPA-nak van szüksége
	
	public User(long id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", " + (username != null ? "username=" + username : "") + "]";
	}
	
	
}
