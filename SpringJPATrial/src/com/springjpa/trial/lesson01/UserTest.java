package com.springjpa.trial.lesson01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjpa.trial.lesson01.domain.User;
import com.springjpa.trial.lesson01.service.UserService;

public class UserTest {

	@Test
	public void testSaveUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = new User();
		user.setName("mix");
		user.setPasw("mixpasw");
		UserService userSrv = (UserService)context.getBean("userSrv");
		userSrv.saveUser(user);
	}
}
