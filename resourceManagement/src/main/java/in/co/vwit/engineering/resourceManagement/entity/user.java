package in.co.vwit.engineering.resourceManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class user {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	
	private String userName;
	 
	private String Password;

	
	

	

	public int getUserId() {
		return UserId;
	}






	public void setUserId(int userId) {
		UserId = userId;
	}






	public String getUserName() {
		return userName;
	}






	public void setUserName(String userName) {
		this.userName = userName;
	}






	public String getPassword() {
		return Password;
	}






	public void setPassword(String password) {
		Password = password;
	}






	@Override
	public String toString() {
		return "user [UserId=" + UserId + ", userName=" + userName + ", Password=" + Password + "]";
	}






	public user() {
		super();
	}
	
	
	
	
	

}
