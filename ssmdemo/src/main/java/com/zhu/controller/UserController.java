package com.zhu.controller;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.zhu.domain.User;
import com.zhu.service.IUserService;
/**
 * 简单的ssm测试
 * @author zhuqinhong
 *
 */
@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/a.do")
	@ResponseBody
	public User getUser1(User user) {
		User u = userService.getUserByUsernameAndPassword(user);
		return u;

	}

	@RequestMapping(value = "/b.do")
	@ResponseBody
	public List<Map<String, Object>> getUser2(User user) {
		List<Map<String, Object>> list = userService.getUserListReturnMap(user);
		return list;

	}

	@RequestMapping(value = "/c.do")
	@ResponseBody
	public List<User> getUser3(User user) {
		List<User> list = userService.getUserListReturnUser(user);
		return list;

	}

}
