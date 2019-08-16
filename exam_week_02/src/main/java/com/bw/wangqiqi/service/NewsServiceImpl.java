package com.bw.wangqiqi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.wangqiqi.entity.News;
import com.bw.wangqiqi.mapper.NewsMapper;

/**
 * @作者:王琪琪
 * @时间:2019年8月12日
 * 
 */
@Service
@Transactional
public class NewsServiceImpl implements NewsService{
	@Autowired
	private NewsMapper nm;
	//列表
	public List<News> selectAll() {
		return nm.selectAll();
	}
	

}
