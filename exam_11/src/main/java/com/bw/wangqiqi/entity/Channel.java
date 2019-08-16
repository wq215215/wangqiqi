package com.bw.wangqiqi.entity;

/**
 * @作者:王琪琪
 * @时间:2019年8月15日
 * 
 */
public class Channel {
 private int id;
 private String name;
 private String description;
 private String icon;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getIcon() {
	return icon;
}
public void setIcon(String icon) {
	this.icon = icon;
}
public int getSorted() {
	return sorted;
}
public void setSorted(int sorted) {
	this.sorted = sorted;
}
@Override
public String toString() {
	return "Channel [id=" + id + ", name=" + name + ", description=" + description + ", icon=" + icon + ", sorted="
			+ sorted + "]";
}
public Channel() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
