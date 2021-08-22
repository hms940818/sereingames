package com.sereingames.service;

import java.io.IOException;

import com.mybatis.dao.model.User;
import com.sereingames.logic.HomeLogic;
import com.sereingames.logic.RegistLogic;

public class RegistService {
	
	/**
	 * 检索用户因袭
	 * @return
	 */
	public User getUserById(){
		
		HomeLogic homeLogic = new HomeLogic();
		User userBean = new User();
		try {
			userBean = homeLogic.getUserById();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return userBean;
	}
	
	/**
	 * 注册用户
	 * @param userBean
	 * @throws IOException
	 */
	public void regist(User userBean) throws IOException{
		
		RegistLogic registLogic = new RegistLogic();
		registLogic.regist(userBean);
		
	}
	
	/**
	 * 删除用户
	 * @param userBean
	 * @throws IOException
	 */
	public void deleteUser(User userBean) throws IOException{
		
		RegistLogic registLogic = new RegistLogic();
		registLogic.deleteUser(userBean);
		
	}

}
