package com.example.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.api.UserRespository;
import com.example.springbootdemo.domin.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRespository  userRespositoryImpl;
	
	@RequestMapping("/users/add")
	public void addUser() {
		User  user  = new User();
		user.setId((long) 1);
		user.setName("zhangsan");
		user.setEmail("1234@qq.com");
		userRespositoryImpl.addUser(user);
	}
	/**
	 * 获得用户列表
	 */
	@RequestMapping("/users/get")
	public List<User> listUser(){
		return userRespositoryImpl.listUser();
	}
	
	/**
	 * 修改用户
	 */
	@RequestMapping("/users/update")
	public void saveOrUpdateUser(@PathVariable("id")  Long id, @RequestBody User user) {
		userRespositoryImpl.saveOrUpdateUser(user.getId(),user);
	}

}
