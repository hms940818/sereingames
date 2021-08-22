package com.sereingames.service;

import java.io.IOException;

import com.mybatis.dao.model.User;
import com.sereingames.logic.HomeLogic;
import com.sereingames.model.HomeWebDto;

public class HomeService {
	
	
	/**
	 * 获取用户信息
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
	 * 初始化
	 */
	public HomeWebDto init() {
		return null;
		
	}

}
