package com.example.springbootdemo.api;

import java.util.List;

import com.example.springbootdemo.domin.User;

public interface UserRespository {
	User saveOrUpdateUser(Long id, User user);
	List<User> listUser();
	void deleteUser(Long id);
	void addUser(User user);
	

}
