package com.bw.wangqiqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.wangqiqi.entity.User;
import com.bw.wangqiqi.service.UserService;

/**
 * @作者:王琪琪
 * @时间:2019年8月7日
 * 
 */
@Controller
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping("list.do")
	public String selectall(Model model){
		List<User> list = us.selectAll();
		model.addAttribute("list",list);
		return "list";
		
		
	}

}
