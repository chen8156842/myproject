package com.ky.dao;

import org.apache.ibatis.annotations.Param;

import com.ky.pojo.User;

public interface IUserDao {
	 public User getUserById(@Param("userId")int userId);  
}
