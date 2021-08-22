package com.sereingames.logic;

import java.io.IOException;

import org.apache.ibatis.session.SqlSessionFactory;

import com.commom.InitSqlSessionFactory;
import com.mybatis.dao.UserDaoImpl;
import com.mybatis.dao.mapper.UserDao;
import com.mybatis.dao.model.User;

public class RegistLogic {
	
	private SqlSessionFactory sqlSessionFactory;
	public User getUserById() throws IOException{
		

		sqlSessionFactory = InitSqlSessionFactory.initSqlSessionFactory();
		User userBean = new User();
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		userBean = userDao.findUserById("test@test.com");
		
		return userBean;
	}
	
	/**
	 * ×¢²á
	 * @throws IOException 
	 */
	public void regist(User userBean) throws IOException {

		sqlSessionFactory = InitSqlSessionFactory.initSqlSessionFactory();
		
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		userDao.insertUser(userBean);
	}

	/**
	 * É¾³ý
	 * @throws IOException 
	 */
	public void deleteUser(User userBean) throws IOException {

		sqlSessionFactory = InitSqlSessionFactory.initSqlSessionFactory();
		
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		userDao.deleteUserById(userBean);
	}
}
