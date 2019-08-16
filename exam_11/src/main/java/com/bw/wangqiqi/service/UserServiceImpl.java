package com.bw.wangqiqi.service;

import java.util.List;

import com.bw.wangqiqi.entity.User;
import com.bw.wangqiqi.mapper.UserMapper;

/**
 * @作者:王琪琪
 * @时间:2019年8月16日
 * 
 */

public class UserServiceImpl implements UserService{

	 private UserMapper um;
	public List<User> selectall() {
		return um.selectall();
	} 

}
