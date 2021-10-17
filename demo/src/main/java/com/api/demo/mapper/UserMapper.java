package com.api.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.api.demo.model.User;


public interface UserMapper {
	public String insertUser(User user);

	public String updateUser(User user);

	public String deleteUserById(int userId);

	public List<User> selectAllUser();

	public User selectUserById(int userId);
}
