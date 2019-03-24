package com.zhu.dao;

import java.util.List;
import java.util.Map;

import com.zhu.domain.User;

public interface UserMapper {

	public User getUserByUsernameAndPassword(User user);

	public List<Map<String,Object>> getUserListReturnMap(Map<String, Object> map);
	
	public List<User> getUserListReturnUser(Map<String, Object> map);

}
