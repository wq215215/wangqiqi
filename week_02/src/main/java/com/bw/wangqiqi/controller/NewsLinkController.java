package com.bw.wangqiqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.wangqiqi.entity.NewsLink;
import com.bw.wangqiqi.service.NewsLinkService;
import com.bw.wangqiqi.service.NewsLinkServiceImpl;

/**
 * @作者:王琪琪
 * @时间:2019年8月11日
 * 
 */
@Controller
public class NewsLinkController {
	
	@Autowired 
	private NewsLinkService ns;
	
	@RequestMapping("list")
	public String list(Model model){
		List<NewsLink> list = ns.list();
		model.addAttribute("list", list);
		return "index";
		
	}
	
	

}
