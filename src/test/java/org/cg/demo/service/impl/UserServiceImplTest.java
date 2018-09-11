package org.cg.demo.service.impl;

import java.util.List;

import org.cg.demo.bean.EasyUIPage;
import org.cg.demo.pojo.User;
import org.cg.demo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {
	private UserService userService;
	
	@Before
	public void setUp(){
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/applicationContext.xml","spring/applicationContext-mybatis.xml"});
		userService = context.getBean(UserService.class); 
	}
	
	@Test
	public void queryPageTest() {
		EasyUIPage userPage = userService.queryPage();
		System.out.println(userPage);
	}
	
	@Test
	public void queryAllUser() {
		List<User> users = userService.queryAllUser();
		for(User user:users) {
			System.out.println(user);
		}
	}
}
