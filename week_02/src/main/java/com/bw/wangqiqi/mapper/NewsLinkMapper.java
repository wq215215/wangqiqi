package com.bw.wangqiqi.mapper;

import java.util.List;

import com.bw.wangqiqi.entity.NewsLink;

/**
 * @作者:王琪琪
 * @时间:2019年8月11日
 * 
 */
public interface NewsLinkMapper {
  void add(NewsLink newLink);
  List<NewsLink> list();
  
}
