package com.zhu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhu.dao.UserMapper;
import com.zhu.domain.User;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;

	public User getUserByUsernameAndPassword(User user) {
		User u = userMapper.getUserByUsernameAndPassword(user);
		return u;
	}
	
	public List<Map<String,Object>> getUserListReturnMap(User user) {
		Map<String,Object> map = new HashMap<>();
		map.put("age", user.getAge());
		List<Map<String,Object>> list= userMapper.getUserListReturnMap(map);
		return list;
	}

	@Override
	public List<User> getUserListReturnUser(User user) {
		Map<String,Object> map = new HashMap<>();
		map.put("age", user.getAge());
		List<User> list= userMapper.getUserListReturnUser(map);
		return list;
	}
	
}
