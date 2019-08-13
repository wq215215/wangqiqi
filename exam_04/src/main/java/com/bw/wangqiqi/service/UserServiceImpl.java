package com.bw.wangqiqi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.wangqiqi.entity.User;
import com.bw.wangqiqi.mapper.UserMapper;

/**
 * @作者:王琪琪
 * @时间:2019年8月7日
 * 
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired 
	private UserMapper um;
	public List<User> selectAll() {
		 
		return um.selectAll();
	}

}
