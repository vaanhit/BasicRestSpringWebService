package com.rohit.controller;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/user/")
public class SpringServiceController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public User getUser(@PathVariable int id) {
		User user = sampleUser();
		return user;
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<User> getAllUsers() {
		List<User> users = allUsers();
		return users;
	}

	private User sampleUser() {
		User user = new User();
		user.setEmail("rohitdec01@gmail.com");
		user.setFirstName("rohit");
		user.setFirstName("Bhatia");
		user.setUserid(10);

		return user;
	}

	private List<User> allUsers() {

		List<User> lst = new ArrayList<User>();
		User user = new User();
		user.setEmail("rohitdec01@gmail.com");
		user.setFirstName("rohit");
		user.setFirstName("Bhatia");
		user.setUserid(10);

		lst.add(user);

		User user1 = new User();
		user1.setEmail("rohitdec01@gmail.com");
		user1.setFirstName("rohit");
		user1.setFirstName("Bhatia");
		user1.setUserid(10);

		lst.add(user1);
		return lst;

	}

}