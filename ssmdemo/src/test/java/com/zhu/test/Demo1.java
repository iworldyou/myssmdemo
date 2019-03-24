package com.zhu.test;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhu.domain.User;
import com.zhu.service.IUserService;
/**
 * 
 * @author zhuqinhong
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)//使用spring整合junit4
@ContextConfiguration(locations="classpath:applicationContext.xml")//指定spring配置文件的位置
public class Demo1 {
	
	@Autowired
	private IUserService userService;
	
	@Test
	public void test01() {
		User user = new User();
		user.setUsername("naruto");
		user.setPassword("123");
		User u = userService.getUserByUsernameAndPassword(user);
		System.out.println(u);
		//User [id=1, username=naruto, password=123, nickname=旋涡鸣人, age=1]
	}
	
	@Test
	public void test02() {
		User user = new User();
		user.setAge(2);
		List<Map<String,Object>> list = userService.getUserListReturnMap(user);
		System.out.println(list);
		/*
		 * [{password=123, nickname=宇智波鼬, id=2, age=2, username=itachi}, 
		 * {password=123, nickname=小楠, id=3, age=2, username=konan}]
		 */
	}
	
	@Test
	public void test03() {
		User user = new User();
		user.setAge(2);
		List<User> list = userService.getUserListReturnUser(user);
		System.out.println(list);
		/*
		 * [User [id=2, username=itachi, password=123, nickname=宇智波鼬, age=2], 
		 * User [id=3, username=konan, password=123, nickname=小楠, age=2]]
		 */
	}
	
	
	

}
