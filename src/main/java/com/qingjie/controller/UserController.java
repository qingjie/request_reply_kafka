package com.qingjie.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingjie.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/hi")
	public String hi() {
		return "I'm qingjie";
	}

	@GetMapping("/hello")
	public ArrayList<User> hello() {
		ArrayList<User> userList = new ArrayList<>();

		User user1 = new User();
		user1.setId(1L);
		user1.setName("name1");
		user1.setTeamName("teamName1");
		user1.setSalary(1000L);
		userList.add(user1);

		User user2 = new User();
		user2.setId(2L);
		user2.setName("name2");
		user2.setTeamName("teamName2");
		user2.setSalary(2000L);
		userList.add(user2);

		User user3 = new User();
		user3.setId(3L);
		user3.setName("name3");
		user3.setTeamName("teamName3");
		user3.setSalary(3000L);
		userList.add(user3);

		return userList;
	}

}
