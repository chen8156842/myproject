package com.ky.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ky.dao.IUserDao;
import com.ky.pojo.User;
import com.ky.service.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao iUserDao;

	public User getUserById(int userId) {
		return iUserDao.getUserById(userId);
	}
}
