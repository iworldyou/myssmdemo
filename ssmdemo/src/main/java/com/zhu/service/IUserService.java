package com.zhu.service;

import java.util.List;
import java.util.Map;

import com.zhu.domain.User;

public interface IUserService {

	public User getUserByUsernameAndPassword(User user);
	
	public List<Map<String, Object>> getUserListReturnMap(User user);
	
	public List<User> getUserListReturnUser(User user);

}
