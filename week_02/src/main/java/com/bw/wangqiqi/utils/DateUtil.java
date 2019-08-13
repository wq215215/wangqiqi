package com.bw.wangqiqi.utils;

 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @作者:王琪琪
 * @时间:2019年8月11日
 * 
 */
public class DateUtil {
  public static Date StringToDate(String src,String pattern) {
	  SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	  try {
		return sdf.parse(src);
	} catch (ParseException e) {
		 
		e.printStackTrace();
	}
	  
	return null;
	
}
}
