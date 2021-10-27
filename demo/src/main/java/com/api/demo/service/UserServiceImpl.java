package com.api.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.mapper.UserMapper;
import com.api.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	public void deleteUserById(int userId) {
		userMapper.deleteUserById(userId);
	}

	public List<User> selectAllUser() {
		return userMapper.selectAllUser();
	}

}
