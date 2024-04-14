package in.co.vwit.engineering.resourceManagement.service;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.vwit.engineering.resourceManagement.Doa.UserDao;
import in.co.vwit.engineering.resourceManagement.entity.user;

@Service
public class userService {

	
	@Autowired
	private UserDao usd;
	
	public void save(user u) {
		usd.save(u)	;
		
	}

	public List<user> GetAllUsers() {
		// TODO Auto-generated method stub
	  return  usd.findAll();
	}

	public List<user> GetUserbyname(String name) {
		return usd.findByUserName(name);
	}

	public int check(String username, String password) {
		// TODO Auto-generated method stub
		
		
		List<user> u=usd.findByUserName(username);
		
		int flag=0;
		System.out.println(u);
		
		
		  for(user uu:u)
		  {
			  System.out.println(uu);
			   String p1=uu.getUserName();
			  String p2=uu.getPassword();
			 if(p1.equals(username))
			 {
				 if(p2.equals(password))
				 {
					 System.out.println("LoginSuccess");
					 flag=1;
				 }
			 }
			  
			
		  }
		  return flag;
			  
		
	}
	
	

}
