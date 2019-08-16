package com.bw.wangqiqi.entity;

/**
 * @作者:王琪琪
 * @时间:2019年8月15日
 * 
 */
public class Category {
 private int id;
 private String name;
 private int channel_id;
 private int sorted;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getChannel_id() {
	return channel_id;
}
public void setChannel_id(int channel_id) {
	this.channel_id = channel_id;
}
public int getSorted() {
	return sorted;
}
public void setSorted(int sorted) {
	this.sorted = sorted;
}
public Category(int id, String name, int channel_id, int sorted) {
	super();
	this.id = id;
	this.name = name;
	this.channel_id = channel_id;
	this.sorted = sorted;
}
@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + ", channel_id=" + channel_id + ", sorted=" + sorted + "]";
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
}
