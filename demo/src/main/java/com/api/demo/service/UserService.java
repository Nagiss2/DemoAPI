package com.api.demo.service;

import java.util.List;

import com.api.demo.model.User;

public interface UserService {
	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUserById(int userId);

	public List<User> selectAllUser();

}
