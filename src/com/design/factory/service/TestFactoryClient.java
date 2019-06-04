package com.design.factory.service;

public class TestFactoryClient {

	public static void main(String[] args) {
		ServiceFactory factory = new ServiceFactory();
		UserService userService = factory.createUserService();
		userService.addUser(new User());
	}

}
