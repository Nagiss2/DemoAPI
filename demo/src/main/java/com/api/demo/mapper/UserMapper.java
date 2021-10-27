package com.api.demo.mapper;

import java.util.List;

import com.api.demo.model.User;

public interface UserMapper {
	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUserById(int userId);

	public List<User> selectAllUser();

}
