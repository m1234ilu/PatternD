package com.design.factory.service;

import java.io.InputStream;
import java.util.Properties;

public class ServiceFactory {
	public UserService createUserService() {
		UserService userService = null;
		try {
			InputStream inputStream = ServiceFactory.class.getResourceAsStream("service.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			String serviceClassName = properties.getProperty("UserService");
			userService = (UserService) (Class.forName(serviceClassName).newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userService;

	}

	/**
	 * public UserService createUserService() {
	 *  //return new UserServiceImpl();
	 * //只要修改工厂生产对象的方式，客户端不用改变 Properties properties = new Properties(); return new
	 * UserServiceImpl2(); }
	 */

}
