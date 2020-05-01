package com.example.springbootdemo.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springbootdemo.api.UserRespository;
import com.example.springbootdemo.domin.User;

@Repository
public class UserRepositoryImpl implements UserRespository{

	List<User> user = new ArrayList<User>();
	@Override
	public User saveOrUpdateUser(Long id, User user) {
		// TODO Auto-generated method stub
		user.setEmail("11111");
		this.user.add(user);
		return user;
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return user;
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		this.user.remove(id);
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.user.add(user);
	}

}
