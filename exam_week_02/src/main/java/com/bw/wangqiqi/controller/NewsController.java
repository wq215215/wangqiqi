package com.bw.wangqiqi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.wangqiqi.entity.News;
import com.bw.wangqiqi.service.NewsService;

/**
 * @作者:王琪琪
 * @时间:2019年8月12日
 * 
 */
@Controller
public class NewsController {
	@Autowired
	private NewsService ns;
	//列表
	@RequestMapping("list.do")
	private  String SelectALL(Model model){
		List<News> list = ns.selectAll();
		model.addAttribute("list", list);
		return "list";
		
	}
}
