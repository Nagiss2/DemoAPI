package com.api.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.api.demo.model.User;

@Mapper
public interface UserMapper {
	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUserById(int userId);

	public List<User> selectAllUser();

	public User selectUserById(int userId);
}
