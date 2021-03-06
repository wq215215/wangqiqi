package com.bw.wangqiqi.entity;

/**
 * @作者:王琪琪
 * @时间:2019年8月15日
 * 
 */
public class Article {
	private int id;
	private String title;
	private String summary;
	private String content;
	private String picture;
	private int channel_id;
	private int category_id;
	private int user_id;
	private int hits;
	private boolean hot;
	private int status;
	private int deleted;
	private String created;
	private String updated;
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
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public boolean isHot() {
		return hot;
	}
	public void setHot(boolean hot) {
		this.hot = hot;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public Article(int id, String title, String summary, String content, String picture, int channel_id,
			int category_id, int user_id, int hits, boolean hot, int status, int deleted, String created,
			String updated) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.picture = picture;
		this.channel_id = channel_id;
		this.category_id = category_id;
		this.user_id = user_id;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", summary=" + summary + ", content=" + content + ", picture="
				+ picture + ", channel_id=" + channel_id + ", category_id=" + category_id + ", user_id=" + user_id
				+ ", hits=" + hits + ", hot=" + hot + ", status=" + status + ", deleted=" + deleted + ", created="
				+ created + ", updated=" + updated + "]";
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
