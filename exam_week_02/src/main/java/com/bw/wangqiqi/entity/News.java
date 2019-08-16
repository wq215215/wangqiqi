package com.bw.wangqiqi.entity;

import java.sql.Date;

/**
 * @作者:王琪琪
 * @时间:2019年8月12日
 * 
 */
public class News{
	//id title url score datetime
	private int id;
	private String title;
	private String url;
	private int score;
	private Date datetime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public News(int id, String title, String url, int score, Date datetime) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
		this.score = score;
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", url=" + url + ", score=" + score + ", datetime=" + datetime
				+ "]";
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
