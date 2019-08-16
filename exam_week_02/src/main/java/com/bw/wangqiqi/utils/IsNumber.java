package com.bw.wangqiqi.utils;

import java.util.Date;

import org.apache.ibatis.jdbc.Null;

/**
 * @作者:王琪琪
 * @时间:2019年8月12日
 * 
 */
public class IsNumber {
	private static final String Null = null;

	public static Date date(String src,String pattern) {
		if(src!= Null || src!=""){
			pattern.matches(src);
		}
		
		return null;
		
		
		
	}

}
