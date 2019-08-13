package com.bw.wangqiqi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.wangqiqi.entity.NewsLink;
import com.bw.wangqiqi.mapper.NewsLinkMapper;

/**
 * @作者:王琪琪
 * @时间:2019年8月11日
 * 
 */
@Service("newLinkService")
public class NewsLinkServiceImpl implements NewsLinkService {
   @Autowired
   private NewsLinkMapper nm;
	public List<NewsLink> list() {
		return nm.list();
	}

}
