package com.nuc.controller;

import com.nuc.bean.User;
import com.nuc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author 闫文强
 * @create 2018-05-01 22:05
 */

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") Integer id){
		User user = userRepository.findOne(id);
		return user;
	}

	@GetMapping("/user")
	public User insertUser(User user){
		User save = userRepository.save(user);
		return save;
	}

}