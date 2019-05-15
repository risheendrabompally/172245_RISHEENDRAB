package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@RequestMapping("/api")
@RestController
public class HomeController {
     
	@Autowired
	UserRepository rep;
	
    @RequestMapping("/")
	public String Home() {
		return "home.jsp";
	}
    
	 @GetMapping("/show")
	  public List<User> getAllUsers(){
		  List<User> user=new ArrayList<>();
		  rep.findAll().forEach(user::add);
		  return user;
	  }
	 
	@GetMapping("/users/create")
	 public User post(@RequestBody User users){
		  User _user=rep.save(users);
		return _user;
		  
	  }
	 
}
