package in.co.vwit.engineering.resourceManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.co.vwit.engineering.resourceManagement.entity.user;
import in.co.vwit.engineering.resourceManagement.service.userService;

@RestController
public class UserController {
	
	@Autowired
	private userService us;
	
	@PostMapping("/NewUserRegistration")	
	public ResponseEntity<user> insertNewUser(@RequestBody user u) {	
		us.save(u);
		
		ResponseEntity<user> entity=new ResponseEntity<user>(u,HttpStatus.CREATED);
		return entity;
		
	}
	
	@GetMapping("/getAllUsers")
	public List<user> getAllUsers(){
		
		return us.GetAllUsers();
		
	
	}
	
	@GetMapping("/getUser/{name}")
	public List<user> getAllUsers(@PathVariable("name") String name){
		
		return us.GetUserbyname(name);
		
	}
	
	@GetMapping("/Check/{username}/{password}")
	public int Checkuser(@PathVariable("username") String username,@PathVariable("password") String password){
		
		return us.check(username,password);
		
	}
	

	

}
