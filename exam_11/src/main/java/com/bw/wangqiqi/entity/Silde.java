package com.bw.wangqiqi.entity;

/**
 * @作者:王琪琪
 * @时间:2019年8月15日
 * 
 */
public class Silde {
	private int id;
	private String title;
	private String picture;
	private String url;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Silde(int id, String title, String picture, String url) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Silde [id=" + id + ", title=" + title + ", picture=" + picture + ", url=" + url + "]";
	}
	public Silde() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
