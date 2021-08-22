package com.mybatis.dao.mapper;

import com.mybatis.dao.model.User;

public interface UserDao {
		public void insertUser(User user);
		public void updateUser(User user);
		public void deleteUserById(User user);
		public User findUserById(String i);
	}